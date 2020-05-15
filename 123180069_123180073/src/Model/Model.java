    package Model;

    import com.mysql.jdbc.Connection;
    import com.mysql.jdbc.Statement;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;


    public class Model {
        Connection koneksi ;
        Statement statement ;
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/service_laptop";//nama database kita di slash terakhir
        static final String USER = "root";
        static final String PASS = "";

        public Model() {
            try {
                Class.forName(JDBC_DRIVER);
                koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);

            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                System.out.println("Koneksi Gagal");
            }
        }

    public void insertContact (String nama , String id_bagian, String username , String password) {
        try {
            String query = "INSERT INTO `pegawai` (`username`,`id_bagian`,`nama`,`password`) "
                    + "VALUES ('" + username + "','" + id_bagian + "','" + nama + "','" + password + "')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Kontak!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void insertContacts (String nama_service , String id_jenis, String harga ) {
        try {
            String query = "INSERT INTO `jenis_service` (`id_jenis`,`nama_service`,`harga`) "
                    + "VALUES ('" + id_jenis + "','" + nama_service + "','" + harga +  "')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Service!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String[][] readContact() {
        int jumlah = 0 ;
        try {
            String data[][] = new String [ getContact()] [5];
            String query = "Select * FROM pegawai";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[jumlah][0] = rs.getString("nama");
                data[jumlah][1] = rs.getString("id_bagian");
                data[jumlah][2] = rs.getString("username");
                data[jumlah][3] = rs.getString("password");
                jumlah++;
            }
            return data;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
        }
    }

    public String[][] readContacts() {
        int jumlah = 0 ;
        try {
            String data[][] = new String [ getContacts()] [5];
            String query = "Select * FROM jenis_service";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[jumlah][0] = rs.getString("nama_service");
                data[jumlah][1] = rs.getString("id_jenis");
                data[jumlah][2] = rs.getString("harga");
                jumlah++;
            }
            return data;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
        }
    }


    public int getContact () {
        int jumlahData =0 ;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM pegawai ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next() ) {
                jumlahData ++ ;
            }
            return jumlahData;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return 0;
        }
    }

    public int getContacts () {
        int jumlahData =0 ;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM jenis_service ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next() ) {
                jumlahData ++ ;
            }
            return jumlahData;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return 0;
        }
    }

    public void hapusKontak(String username) {
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "DELETE FROM pegawai WHERE `username` = '" +username + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di hapus");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Tidak ada data");
        }
    }

    public void hapusKontaks(String id_jenis) {
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "DELETE FROM jenis_service WHERE `id_jenis` = '" +id_jenis + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di hapus");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Tidak ada data");
        }
    }



    public void updateKontak (String nama , String id_bagian, String username , String password){
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "UPDATE `pegawai` SET `nama` ='"+nama+"', `id_bagian` ='"+id_bagian+"', `password` ='"+password+"' "+"WHERE `username` ='"+username+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil di update");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void updateKontaks (String nama_service , String id_jenis, String harga ){
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "UPDATE `jenis_service` SET  `nama_service` ='"+nama_service+"', `harga` ='"+harga+"' "+"WHERE `id_jenis` ='"+id_jenis+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil di update");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public int getBanyakContactSearch (String cari) {
        int jmlh=0;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM pegawai WHERE nama like '%"+cari+"%' ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jmlh ++;
            }
            return jmlh ;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak ada kontak yang di cari");
            return 0 ;
        }
    }

    /*public int getBanyakContactSearchs (String cari) {
        int jmlh=0;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM jenis_service WHERE nama_service like '%"+cari+"%' ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jmlh ++;
            }
            return jmlh ;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak ada kontak yang di cari");
            return 0 ;
        }
    }*/
    public int getBanyakContactSearchs (String cari) {
        int jmlh=0;
        try {
            statement = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM jenis_service WHERE nama_service like '%"+cari+"%' ";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                jmlh ++;
            }
            return jmlh ;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak ada kontak yang di cari");
            return 0 ;
        }
    }

    public String[][] getContactSearch (String cari) {
        try {
            int jmlh = 0 ;
            String data[][] = new String [getBanyakContactSearch(cari)][5] ;
            String query = "SELECT * FROM pegawai WHERE nama like '%"+cari+"%' OR id_bagian like '%"+cari+"%' OR username like '%"+cari+"%' OR password like '%"+cari+"%' ";
            ResultSet rs = statement.executeQuery(query) ;
            while (rs.next()) {
                data[jmlh][0] = rs.getString("nama");
                data[jmlh][1] = rs.getString("id_bagian");
                data[jmlh][2] = rs.getString("username");
                data[jmlh][3] = rs.getString("password");
                jmlh++;
            }
            return data;
        }
        catch (SQLException e) {
            return null;
        }
    }

   /* public String[][] getContactSearchs (String caris) {
        try {
            int jmlh = 0 ;
            String data[][] = new String [getBanyakContactSearchs(caris)][5] ;
            String query = "SELECT * FROM jenis_service WHERE nama_service like '%"+caris+"%' OR id_jenis like '%"+caris+"%' OR harga like '%"+caris+"%' ";
            ResultSet rs = statement.executeQuery(query) ;
            while (rs.next()) {
                data[jmlh][0] = rs.getString("nama_service");
                data[jmlh][1] = rs.getString("id_service");
                data[jmlh][2] = rs.getString("harga");
                jmlh++;
            }
            return data;
        }
        catch (SQLException e) {
            return null;
        }
    }*/

    public String[][] getContactSearchs (String cari) {
        try {
            int jmlh = 0 ;
            String data[][] = new String [getBanyakContactSearchs(cari)][5] ;
            String query = "SELECT * FROM jenis_service WHERE nama_service like '%"+cari+"%' OR id_jenis like '%"+cari+"%' OR harga like '%"+cari+"%'  ";
            ResultSet rs = statement.executeQuery(query) ;
            while (rs.next()) {
                data[jmlh][0] = rs.getString("nama_service");
                data[jmlh][1] = rs.getString("id_jenis");
                data[jmlh][2] = rs.getString("harga");

            }
            return data;
        }
        catch (SQLException e) {
            return null;
        }
    }

}

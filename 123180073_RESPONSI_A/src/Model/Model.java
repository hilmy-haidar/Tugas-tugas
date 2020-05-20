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
    static final String DB_URL = "jdbc:mysql://localhost/responsipbo";//nama database kita di slash terakhir
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

    public void insertContact (String id_anggota , String nama_anggota, String id_buku , String judul_buku) {
        try {
            String query = "INSERT INTO `perpustakaan` (`id_anggota`,`nama_anggota`,`id_buku`,`judul_buku`) "
                    + "VALUES ('" + id_anggota + "','" + nama_anggota + "','" + id_buku + "','" + judul_buku + "')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Data!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String[][] readContact() {
        int jumlah = 0 ;
        try {
            String data[][] = new String [ getContact()] [5];
            String query = "Select * FROM perpustakaan";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[jumlah][0] = rs.getString("id_anggota");
                data[jumlah][1] = rs.getString("nama_anggota");
                data[jumlah][2] = rs.getString("id_buku");
                data[jumlah][3] = rs.getString("judul_buku");
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
            String query = "SELECT * FROM perpustakaan ";
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


    public void hapusKontak(String id_anggota) {
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "DELETE FROM perpustakaan WHERE `id_anggota` = '" +id_anggota + "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di hapus");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Tidak ada data");
        }
    }


    public void updateKontak (String id_anggota , String nama_anggota, String id_buku , String judul_buku){
        try{
            statement = (Statement) koneksi.createStatement();
            String query = "UPDATE `perpustakaan` SET `nama_anggota` ='"+nama_anggota+"', `id_buku` ='"+id_buku+"', `judul_buku` ='"+judul_buku+"' "+"WHERE `id_anggota` ='"+id_anggota+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil di update");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }





}

package Model;

import javax.swing.*;
import java.sql.*;

public class ModelTransaksi {
    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/service_laptop";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement;//untuk perintah query

    public ModelTransaksi() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }

    public void insertData(String username, String id_jenis, String nama_pelanggan, String no_hp, int total_biaya){
        try {
            String query = "INSERT INTO `transaksi`(`username`,`id_jenis`,`nama_pelanggan`, `no_hp`, `total_biaya`) VALUES ('"+username+"','"+id_jenis+"','"+nama_pelanggan+"','"+no_hp+"',"+total_biaya+")";//value 1 (id diskip)
            //String '"+String+"' kalau Int "+int+"
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query); //execute querynya
            System.out.println("Berhasil ditambahkan");
            JOptionPane.showMessageDialog(null, "Data Berhasil");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }


    public int getBanyakData(){//menghitung jumlah baris
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from transaksi"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                jmlData++;
            }
            return jmlData;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

   public String[][] readData(){
        try{
            int jmlData = 0;//menampung jumlah data
            int nomor = 1;

            String data[][] = new String[getBanyakData()][7]; //baris, kolom nya ada 3

            String query = "Select * from transaksi "; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("no_transaksi");
                data[jmlData][1] = resultSet.getString("username");
                data[jmlData][2] = resultSet.getString("id_jenis");
                data[jmlData][3] = resultSet.getString("nama_pelanggan");
                data[jmlData][4] = resultSet.getString("no_hp");
                data[jmlData][5] = resultSet.getString("total_biaya");
                nomor++;
                jmlData++; //barisnya berpindah terus
            }
            return data;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    /*public String[][] readContacts() {
        int jumlah = 0 ;
        try {
            String data[][] = new String [ getBanyakData()] [5];
            String query = "Select * FROM transaksi";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[jumlah][0] = rs.getString("nama_service");
                data[jumlah][1] = rs.getString("id_jenis");
                data[jumlah][2] = rs.getString("harga");
                data[jumlah][3] = rs.getString("nama_service");
                data[jumlah][4] = rs.getString("id_jenis");
                jumlah++;
            }
            return data;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Eror");
            return null;
        }
    }*/



    public void deleteData(int no_transaksi) {
        try{
            String query = "DELETE FROM `transaksi` WHERE `no_transaksi` = '"+no_transaksi+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");

        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }

    public void updateData(int no_transaksi, String nama_pelanggan, String no_hp, int total_biaya){
        try{

            statement = koneksi.createStatement();

            String query = "UPDATE `transaksi` SET `nama_pelanggan`='"+nama_pelanggan+"',`no_hp`='"+no_hp+"',`total_biaya`= "+total_biaya+" WHERE `no_transaksi` = "+no_transaksi+"";
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Edit Data Sukses!");

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public int getJmlDataSearch(String search) {
        int jmlData = 0;
        try {
            String query = "SELECT * FROM transaksi WHERE nama_pelanggan LIKE '%" + search + "%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }

            return jmlData;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

            return 0;
        }
    }

    public String[][] search(String search) {
        try {
            int jmlData = 0;
            int nomor = 1;
            String datas[][] = new String[getJmlDataSearch(search)][8];
            String query = "SELECT * FROM transaksi WHERE nama_pelanggan LIKE '%" +search+ "%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                datas[jmlData][0] = resultSet.getString("no_transaksi");
                datas[jmlData][1] = resultSet.getString("username");
                datas[jmlData][2] = resultSet.getString("id_jenis");
                datas[jmlData][3] = resultSet.getString("nama_pelanggan");
                datas[jmlData][4] = resultSet.getString("no_hp");
                datas[jmlData][5] = resultSet.getString("total_biaya");
                nomor++;
                jmlData++;
            }

            return datas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

            return null;
        }
    }

    public void setSearch(String search) {
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String[][] readPegawai() {
        int jumlah = 0 ;
        try {
            String data[][] = new String [ getPegawai()] [5];
            String query = "Select * FROM pegawai";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                data[jumlah][0] = rs.getString("nama");
                data[jumlah][1] = rs.getString("username");
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

    public String[][] readService() {
        int jumlah = 0 ;
        try {
            String data[][] = new String [ getService()] [4];
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


    public int getPegawai () {
        int jumlahData =0 ;
        try {
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
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

    public int getService () {
        int jumlahData =0 ;
        try {
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
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


}

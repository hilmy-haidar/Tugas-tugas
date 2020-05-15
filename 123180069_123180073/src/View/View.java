package View;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class View extends JFrame {
    JLabel lNama_pelanggan, lStatus, lNo_hp, lTotal_biaya, lno_transaksi, lUsername, lId_jenis,lNama_service;
    public JTextField tfNama_pelanggan, tfNo_hp, tfTotal_biaya, tfno_transaksi, tfSearch, tfUsername, tfId_jenis,tfNama_service;
    //String nama_service[] = {"1. LCD = 800.000", "2. Keyboard = 500.000", "3. Software = 1000.000"};
   // JComboBox cbNama_service;
    public JButton bRefresh, bCreate, bUpdate, bDelete, bExit, bSearch;
    public JTable tabel,tabel1,tabel2;
    DefaultTableModel tableModel, tableModel1, tableModel2;
    JScrollPane scrollPane,scrollPane1,scrollPane2;
    public Object namaKolom[] = {"No. Tran","username","id_jenis","Pelanggan", "No. Hp", "Biaya"};
    public Object namaKolom1[] = {"Id_Jasa", "Jasa", "Harga"};
    public Object namaKolom2[] = {"Pegawai", "Username"};


    public View() {
        setTitle("Data Transaksi");
        tableModel = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        tableModel1 = new DefaultTableModel(namaKolom1, 0);
        tabel1 = new JTable(tableModel1);
        scrollPane1 = new JScrollPane(tabel1);

        tableModel2 = new DefaultTableModel(namaKolom2, 0);
        tabel2 = new JTable(tableModel2);
        scrollPane2 = new JScrollPane(tabel2);

        lUsername = new JLabel("Pegawai Yang Melayani");
        lId_jenis = new JLabel("Id Jenis");
        lNama_pelanggan = new JLabel("Nama Pelanggan");
        lStatus = new JLabel("Jasa Service");
        lNo_hp = new JLabel("NO. Hp");
        lTotal_biaya = new JLabel("Total Biaya");
        lno_transaksi = new JLabel("no_transaksi");

        tfUsername = new JTextField();
        tfId_jenis = new JTextField();
        tfNama_pelanggan = new JTextField();
        tfNo_hp = new JTextField();
        tfTotal_biaya = new JTextField();
        tfno_transaksi = new JTextField();
        tfSearch = new JTextField();
        tfNama_service = new JTextField();

        bRefresh = new JButton("Refresh");
        bCreate = new JButton("Create");
        bUpdate = new JButton("Update");
        bDelete = new JButton("Delete");
        bExit = new JButton("Exit");
        bSearch = new JButton("Search");

        setLayout(null);
        add(scrollPane);
        add(scrollPane1);
        add(scrollPane2);
        add(lUsername);
        add(tfUsername);
        add(lId_jenis);
        add(tfId_jenis);
        add(lNama_pelanggan);
        add(tfNama_pelanggan);
       //add(lNama_service);
        //add(tfNama_service);
        add(lNo_hp);
        add(tfNo_hp);
        add(lTotal_biaya);
        add(tfTotal_biaya);
        add(lno_transaksi);
        add(tfno_transaksi);
        add(tfSearch);

        add(bSearch);
        add(bRefresh);
        add(bCreate);
        add(bUpdate);
        add(bDelete);
        add(bExit);

        scrollPane.setBounds(40, 60, 1000, 340);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        scrollPane1.setBounds(380, 460, 280, 100);
        scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        scrollPane2.setBounds(680, 460, 280, 100);
        scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        lUsername.setBounds(40, 410, 150, 30);
        tfUsername.setBounds(40, 440, 150, 25);
        lId_jenis.setBounds(40, 475, 100, 30);
        tfId_jenis.setBounds(40, 505, 150, 25);
//        lNama_service.setBounds(240, 475, 100, 30);
        tfNama_service.setBounds(240, 505, 150, 25);
        lNama_pelanggan.setBounds(40, 540, 100, 30);
        tfNama_pelanggan.setBounds(40, 570, 150, 25);
        lNo_hp.setBounds(40, 605, 100, 30);
        tfNo_hp.setBounds(40, 635, 150, 25);
        lTotal_biaya.setBounds(40, 665, 100, 30);
        tfTotal_biaya.setBounds(40, 695, 150, 25);

        tfSearch.setBounds(40, 20, 260, 25);
        bSearch.setBounds(320, 18, 100, 30);

        bRefresh.setBounds(260, 725, 100, 30);
        bCreate.setBounds(380, 725, 100, 30);
        bDelete.setBounds(500, 725, 100, 30);
        bExit.setBounds(620, 725, 100, 30);


        setSize(1100, 800);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.PINK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public int getno_transaksi() {
        return Integer.parseInt(tfno_transaksi.getText());
    }

    public String getNama_pelanggan() {
        return tfNama_pelanggan.getText();
    }

    public String getUsername() {
        return tfUsername.getText();
    }

    public String getId_jenis() {
        return tfId_jenis.getText();
    }

    public String getNo_hp() {
        return tfNo_hp.getText();
    }

    public int getTotal_biaya() {
        return Integer.parseInt(tfTotal_biaya.getText());
    }

    public String getNama_service() {
        return tfNama_service.getText();
    }

    public String getSearch() {
        return tfSearch.getText();
    }
}

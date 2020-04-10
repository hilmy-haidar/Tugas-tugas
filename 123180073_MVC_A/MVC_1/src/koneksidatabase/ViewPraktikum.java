package koneksidatabase;

import java.awt.Color;

import static java.awt.Color.*;
import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ViewPraktikum extends JFrame {

    JLabel lNim = new JLabel("Nim  ");
    JTextField tfnim = new JTextField();
    JLabel lNamaMhs = new JLabel ("Nama Mahasiswa  ");
    JTextField tfNamaMhs = new JTextField();
    JLabel lAlamatMhs = new JLabel ("Alamat Mahasiswa  ");
    JTextField tfAlamatMhs = new JTextField();


    JButton btnTambahPanel = new JButton("Submit");
    JButton btnBatalPanel = new JButton("Batal");
    JButton btnHapusPanel = new JButton("Hapus");
    JButton btnEditPanel = new JButton("Edit");
    JLabel lNote= new JLabel ("Note : Silahkan pilih data terlebih dahulu sebelum mengedit ataupun menghapus data   ");
    JLabel lform= new JLabel ("FORM PENGISIAN DATA MAHASISWA");
    JLabel lData= new JLabel (" 'DATA MAHASISWA'  ");
    JTable tabel;
    DefaultTableModel tableModel;


    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"NIM","Nama","Alamat"}; //membuat kolom dalam array

    public ViewPraktikum(){

        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        tabel.setBackground(ORANGE);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600, 500);
        getContentPane().setBackground(Color.PINK);

        //TABEL
        add(scrollPane);
        scrollPane.setBounds(20, 185, 480, 150);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBackground(orange);
        add(lNim, ":");
        lNim.setBounds(5, 35, 150, 20);
        add(tfnim);
        tfnim.setBounds(150, 35, 120, 20);
        add(lNamaMhs);
        lNamaMhs.setBounds(5, 60, 150, 20);
        add(tfNamaMhs);
        tfNamaMhs.setBounds(150, 60, 120, 20);
        add(lAlamatMhs);
        lAlamatMhs.setBounds(5, 85, 150, 20);
        add(tfAlamatMhs);
        tfAlamatMhs.setBounds(150, 85, 120, 20);

        add(lNote);
        lNote.setBounds(20,370,720, 20);
        add(lform);
        lform.setBounds(5,5, 720, 20);

        add(lData);
        lData.setBounds(200, 155,720, 20);
        lData.setForeground(BLACK);

        add(btnTambahPanel);
        btnTambahPanel.setBounds(20, 120, 90, 20);
        btnTambahPanel.setBackground(lightGray);
        add(btnBatalPanel);
        btnBatalPanel.setBounds(130, 120, 90, 20);
        add(btnHapusPanel);
        btnHapusPanel.setBounds(20, 345, 90, 20);
        btnHapusPanel.setBackground(red);
        add(btnEditPanel);
        btnEditPanel.setBounds(130, 345, 90, 20);
        btnEditPanel.setBackground(GREEN);
    }
    public String getNim(){
        return tfnim.getText();
    }

    public String getNamaMhs(){
        return tfNamaMhs.getText();
    }

    public String getAlamatMhs(){
        return tfAlamatMhs.getText();
    }
}


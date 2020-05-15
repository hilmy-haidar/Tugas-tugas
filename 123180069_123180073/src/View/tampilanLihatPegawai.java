package View;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import static java.awt.Color.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class tampilanLihatPegawai extends JFrame{


    JPanel ppanel= new JPanel();
    JPanel ppaneldalam = new JPanel();
    public JLabel ljudul, lmenupilihan,lnama,lid_bagian,lusername,lpassword,lnamaisi,lid_bagianisi,lusernameisi,lpasswordisi,lid;
    public JTextField tfsearch;
    Font fjudul,fmenupilihan;
    public JTable tabel ;
    public JButton btntambah , btnkembali, btnhapus, btnupdate,btnrefresh,btnsearch;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    public Object namaKolom [] =  {"nama","bagian","username","password",""} ;
    GroupLayout gppanel,gppaneldalam;

    public tampilanLihatPegawai () {
        fjudul = new Font("Arial Black", Font.BOLD , 21);
        fmenupilihan = new Font("Broadway", Font.BOLD , 21);
        ljudul = new JLabel("DAFTAR PEGAWAI"); ljudul.setFont(fjudul);ljudul.setForeground(white);
        lnama = new JLabel("Nama    :");
        lusername = new JLabel("username    :");
        lpassword = new JLabel("password    :");
        lid_bagian = new JLabel("Bagian  :");
        lid = new JLabel();
        lnamaisi = new JLabel();
        lusernameisi = new JLabel();
        lpasswordisi = new JLabel();
        lid_bagianisi = new JLabel();
        tabelModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        btnsearch = new JButton("Cari");
        tfsearch = new JTextField();
        btntambah = new JButton("Tambah");
        btnkembali = new JButton("Kembali");
        btnhapus = new JButton("Hapus");
        btnupdate = new JButton("Edit");
        btnrefresh = new JButton("Refresh");
        ppanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gppanel = new GroupLayout(ppanel);
        ppanel.setLayout(gppanel);
        ppaneldalam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Terpilih", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        gppaneldalam = new GroupLayout(ppaneldalam);
        ppaneldalam.setLayout(gppaneldalam);
        lmenupilihan = new JLabel("INFO DATA"); lmenupilihan.setFont(fmenupilihan);

        setTitle("Data Pegawai");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(900,600);
        getContentPane().setBackground(BLUE);
        setLocationRelativeTo(null);

        add(ppanel);
        ppanel.add(lmenupilihan);
        ppanel.add(btntambah);
        ppanel.add(btnkembali);
        ppanel.add(btnhapus);
        ppanel.add(btnupdate);
        ppanel.add(btnrefresh);
        ppanel.add(ppaneldalam);
        ppaneldalam.add(lnama);
        ppaneldalam.add(lusername);
        ppaneldalam.add(lpassword);
        ppaneldalam.add(lid_bagian);
        ppaneldalam.add(lnamaisi);
        ppaneldalam.add(lusernameisi);
        ppaneldalam.add(lid_bagianisi);
        ppaneldalam.add(lpasswordisi);
        add(ljudul);
        add(scrollPane);
        add(btnsearch);
        add(tfsearch);

        ppanel.setBounds(540,50,330,480);
        ppanel.setBackground(ORANGE);
        ppaneldalam.setBounds(30,70,275,200);
        lmenupilihan.setBounds(105,30,170,20);
        btntambah.setBounds(170,400,100,30);
        btnkembali.setBounds(70,400,100,30);
        btnhapus.setBounds(170,340,100,30);
        btnupdate.setBounds(70,340,100,30);
        btnrefresh.setBounds(120,280,100,20);
        ljudul.setBounds(180,20,250,20);

        scrollPane.setBounds(50,100,470,430);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        tfsearch.setBounds(50,60,370,20);
        btnsearch.setBounds(420,60,100,20);

        lnama.setBounds(20,50,80,20);
        lid_bagian.setBounds(20,80,80,20);
        lusername.setBounds(20,110,80,20);
        lpassword.setBounds(20,140,80,20);
        lnamaisi.setBounds(95,50,200,20);
        lid_bagianisi.setBounds(95,80,200,20);
        lusernameisi.setBounds(95,110,200,20);
        lpasswordisi.setBounds(95,140,200,20);
        btnhapus.setEnabled(false);
        btnupdate.setEnabled(false);


    }
}

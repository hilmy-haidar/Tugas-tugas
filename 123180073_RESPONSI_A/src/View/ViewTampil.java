package View;

import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ViewTampil extends JFrame{
    JPanel ppanel= new JPanel();
    public JLabel ljudul,ltabel,lnamaisi,lid_bagianisi,lusernameisi,lpasswordisi;
    JLabel  lGambar1,lGambar2,lGambar3,lGambar4,lline,lwa,lweb;
    Font fjudul;
    public JTable tabel ;
    public JButton  btnhapus, btnupdate;
    public JButton btnhome,btnPinjam,btnTampil,btnAbout;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    public Object namaKolom [] =  {"ID","Nama","ID Buku","Judul Buku",""} ;
    GroupLayout gppanel,gppaneldalam;

    public ViewTampil () {
        fjudul = new Font("Calibri", Font.BOLD , 21);
        ltabel =new JLabel("List Buku yang dipinjam");ltabel.setFont(fjudul);
        ljudul = new JLabel("-PERPUSTAKAAN-"); ljudul.setFont(fjudul);ljudul.setForeground(black);

        tabelModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        lnamaisi = new JLabel();
        lusernameisi = new JLabel();
        lpasswordisi = new JLabel();
        lid_bagianisi = new JLabel();

        btnhapus = new JButton("Hapus");
        btnupdate = new JButton("Edit");
        btnhome = new JButton("Home");
        btnPinjam = new JButton("Pinjam");
        btnTampil = new JButton("Tampil");
        btnAbout = new JButton("About Us");

        ppanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gppanel = new GroupLayout(ppanel);
        ppanel.setLayout(gppanel);



        setTitle("Data Perpustakaan");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(900,600);
        getContentPane().setBackground(orange);
        setLocationRelativeTo(null);
        lGambar1 = new JLabel(new ImageIcon(getClass().getResource("/image/perpus.png")));
        lGambar2 = new JLabel(new ImageIcon(getClass().getResource("/image/line.png")));
        lGambar3 = new JLabel(new ImageIcon(getClass().getResource("/image/wa.png")));
        lGambar4 = new JLabel(new ImageIcon(getClass().getResource("/image/web.png")));
        lline = new JLabel(": Perpus19_");
        lwa = new JLabel(": 081344624362");
        lweb=new JLabel(": www.perpusambyar.com");

        add(ppanel);
        ppanel.add(btnhome);
        ppanel.add(btnPinjam);
        ppanel.add(btnTampil);
        ppanel.add(btnAbout);
        add(btnhapus);
        add(btnupdate);
        add(ltabel);
        add(ljudul);
        add(scrollPane);
        ppanel.add(lGambar1);
        ppanel.add(lGambar2);
        ppanel.add(lGambar3);
        ppanel.add(lGambar4);
       ppanel.add(lline);
        ppanel.add(lwa);
        ppanel.add(lweb);

        ppanel.setBounds(540,0,330,600);
        ppanel.setBackground(yellow);
        lGambar1.setBounds(118,0,100,100);
        btnhapus.setBounds(170,120,100,30);
        btnupdate.setBounds(300,120,100,30);
        btnhome.setBounds(110,150,100,30);
        btnPinjam.setBounds(110,200,100,30);
        btnTampil.setBounds(110,250,100,30);
        btnAbout.setBounds(110,300,100,30);
        ltabel.setBounds(165,160,250,50);
        ljudul.setBounds(180,20,250,50);
        lGambar2.setBounds(0,350,80,80);
        lGambar3.setBounds(0,400,80,80);
        lGambar4.setBounds(0,450,80,80);
        lline.setBounds(60,380,80,20);
        lwa.setBounds(60,430,100,20);
        lweb.setBounds(60,480,150,20);

        scrollPane.setBounds(50,200,400,300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        btnhapus.setEnabled(false);
        btnupdate.setEnabled(false);


    }
}

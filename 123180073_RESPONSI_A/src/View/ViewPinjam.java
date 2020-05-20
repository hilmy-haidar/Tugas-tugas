package View;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.ORANGE;
import static java.awt.Color.YELLOW;

public class ViewPinjam extends JFrame {
    Font fjudul,fkata;
    JPanel ppanel= new JPanel();
    //JPanel ppaneldalam = new JPanel();
    JLabel ljudul,lnama, lid_bagian,lusername,lpassword,lGambar1,lGambar2,lGambar3,lGambar4,lline,lwa,lweb;
    public JTextField tfnama, tfid_bagian, tfusername, tfpassword ;
    public JButton btntambah,btnbatal,btnhome,btnPinjam,btnTampil,btnAbout;
    GroupLayout gppanel,gppaneldalam;

    public ViewPinjam () {
        setSize(900,600);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
       getContentPane().setBackground(ORANGE);
        setTitle("-Perpustakaan-");

        fjudul = new Font("Tahoma", Font.BOLD , 20);
        fkata= new Font("Calibri", Font.BOLD,14);
        lGambar1 = new JLabel(new ImageIcon(getClass().getResource("/image/perpus.png")));
        lGambar2 = new JLabel(new ImageIcon(getClass().getResource("/image/line.png")));
        lGambar3 = new JLabel(new ImageIcon(getClass().getResource("/image/wa.png")));
        lGambar4 = new JLabel(new ImageIcon(getClass().getResource("/image/web.png")));

        lnama = new JLabel("Nama : "); lnama.setFont(fkata);
        lid_bagian = new JLabel("Id Anggota : "); lid_bagian.setFont(fkata);
        lusername = new JLabel("Id Buku : "); lusername.setFont(fkata);
        lpassword = new JLabel("Judul Buku : "); lpassword.setFont(fkata);
        ljudul = new JLabel("Perpustakaan"); ljudul.setFont(fjudul);
        lline = new JLabel(": Perpus19_");
        lwa = new JLabel(": 081344624362");
        lweb=new JLabel(": www.perpusambyar.com");
        tfnama = new JTextField();
        tfid_bagian = new JTextField();
        tfusername = new JTextField();
        tfpassword = new JTextField();
        btnbatal = new JButton("Batal");
        btntambah = new JButton("Tambah");
        btnhome = new JButton("Home");
        btnPinjam = new JButton("Pinjam");
        btnTampil = new JButton("Tampil");
        btnAbout = new JButton("About Us");
        ppanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gppanel = new GroupLayout(ppanel);
        ppanel.setLayout(gppanel);
        //ppaneldalam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Terpilih", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
      //  gppaneldalam = new GroupLayout(ppaneldalam);
        //ppaneldalam.setLayout(gppaneldalam);

        add(ppanel);
        ppanel.add(btnhome);
        ppanel.add(btnPinjam);
        ppanel.add(btnTampil);
        ppanel.add(btnAbout);
        add(ljudul);
        add(lnama);
        add(lid_bagian);
        add(lusername);
        add(lpassword);
        add(tfnama);
        add(tfid_bagian);
        add(tfusername);
        add(tfpassword);
        add(btnbatal);
        add(btntambah);
        ppanel.add(lGambar1);
        ppanel.add(lGambar2);
        ppanel.add(lGambar3);
        ppanel.add(lGambar4);
        ppanel.add(lline);
        ppanel.add(lwa);
        ppanel.add(lweb);

        ppanel.setBounds(540,0,330,600);
        ppanel.setBackground(YELLOW);
       // ppaneldalam.setBounds(30,70,275,200);
        lGambar1.setBounds(118,0,100,100);
        ljudul.setBounds(180,60,200,30);
        lid_bagian.setBounds(30,100,80,20);
        tfid_bagian.setBounds(110,100,100,20);
        lnama.setBounds(30,130,80,20);
        tfnama.setBounds(110,130,100,20);
        lusername.setBounds(30,160,80,20);
        tfusername.setBounds(110,160,100,20);
        lpassword.setBounds(30,190,80,20);
        tfpassword.setBounds(110,190,100,20);
        btntambah.setBounds(150,230,100,30);
        btnbatal.setBounds(30,230,100,30);
        btnhome.setBounds(110,150,100,30);
        btnPinjam.setBounds(110,200,100,30);
        btnTampil.setBounds(110,250,100,30);
        btnAbout.setBounds(110,300,100,30);
        lGambar2.setBounds(0,350,80,80);
        lGambar3.setBounds(0,400,80,80);
        lGambar4.setBounds(0,450,80,80);
        lline.setBounds(60,380,80,20);
        lwa.setBounds(60,430,100,20);
        lweb.setBounds(60,480,150,20);

    }
}

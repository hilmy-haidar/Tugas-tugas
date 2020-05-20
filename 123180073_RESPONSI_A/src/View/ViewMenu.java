package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewMenu extends JFrame{
    Font fjudul,fselamat;
    JLabel  ljudul,lsamadengan1,lsamadengan2,lGambar1,lGambar2,lGambar3,lGambar4,lline,lwa,lweb,lselamat,lambyar;
    public JButton btnhome,btnPinjam,btnTampil,btnAbout;

    public ViewMenu () {

        setLayout(null);
        setVisible(true);
        setSize(550,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.YELLOW);
        setBackground(new java.awt.Color(204,204,204));
        setTitle("Perpustakaan");

        fjudul = new Font("Calibri", Font.BOLD , 21);
        fselamat = new Font("Broadway", Font.BOLD , 18);
        ljudul = new JLabel("Perpustakaan");
        lline = new JLabel(": Perpus19_");
        lwa = new JLabel(": 081344624362");
        lweb=new JLabel(": www.perpusambyar.com");
        lselamat=new JLabel("Selamat Datang");
        lambyar=new JLabel("di Perpustakaan Ambyar");
        lGambar1 = new JLabel(new ImageIcon(getClass().getResource("/image/perpus.png")));
        lGambar2 = new JLabel(new ImageIcon(getClass().getResource("/image/line.png")));
        lGambar3 = new JLabel(new ImageIcon(getClass().getResource("/image/wa.png")));
        lGambar4 = new JLabel(new ImageIcon(getClass().getResource("/image/web.png")));

        lsamadengan1 =new JLabel("==========================================================================");
        lsamadengan2 =new JLabel("==========================================================================");
        ljudul.setFont(fjudul);
        lselamat.setFont(fselamat);
        lambyar.setFont(fselamat);

        btnhome = new JButton("Home");
        btnPinjam = new JButton("Pinjam");
        btnTampil = new JButton("Tampil");
        btnAbout = new JButton("About Us");

        add(ljudul);
        add(lGambar1);
        add(lGambar2);
        add(lGambar3);
        add(lGambar4);
        add(btnhome);
        add(btnPinjam);
        add(btnAbout);
        add(btnTampil);
        add(lsamadengan1);
        add(lsamadengan2);
        add(lline);
        add(lwa);
        add(lweb);
        add(lselamat);
        add(lambyar);

        lGambar1.setBounds(160,0,80,80);
        ljudul.setBounds(220,30,160,20);
        lsamadengan1.setBounds(0,10,550,20);
        lsamadengan2.setBounds(0,50,550,20);
        lselamat.setBounds(220,130,300,35);
        lambyar.setBounds(220,160,300,35);
        btnhome.setBounds(50,90,100,30);
        btnPinjam.setBounds(50,140,100,30);
        btnTampil.setBounds(50,190,100,30);
        btnAbout.setBounds(50,240,100,30);
        lline.setBounds(60,380,80,20);
        lwa.setBounds(210,380,100,20);
        lweb.setBounds(350,380,150,20);
        lGambar2.setBounds(0,350,80,80);
        lGambar3.setBounds(150,350,80,80);
        lGambar4.setBounds(300,350,80,80);

    }

}



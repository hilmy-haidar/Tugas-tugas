package View;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.ORANGE;
import static java.awt.Color.YELLOW;

public class ViewEdit extends JFrame {
    Font fjudul,fkata;
    JPanel ppanel= new JPanel();
    JLabel ljudul,lnama, lid_bagian,lusername,lpassword;
    public JTextField tfnama, tfid_bagian, tfusername, tfpassword ;
    public JButton btntambah,btnbatal;
    GroupLayout gppanel,gppaneldalam;

    public ViewEdit () {
        setSize(900,600);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("-Perpustakaan-");

        fjudul = new Font("Times new roman", Font.BOLD , 18);
        fkata= new Font("Calibri", Font.BOLD,14);


        lnama = new JLabel("Nama : "); lnama.setFont(fkata);
        lid_bagian = new JLabel("Id Anggota : "); lid_bagian.setFont(fkata);
        lusername = new JLabel("Id Buku : "); lusername.setFont(fkata);
        lpassword = new JLabel("Judul Buku : "); lpassword.setFont(fkata);
        ljudul = new JLabel("-Perpustakaan Ambyar-"); ljudul.setFont(fjudul);

        tfnama = new JTextField();
        tfid_bagian = new JTextField();
        tfusername = new JTextField();
        tfpassword = new JTextField();
        btnbatal = new JButton("Batal");
        btntambah = new JButton("Update");
        ppanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gppanel = new GroupLayout(ppanel);
        ppanel.setLayout(gppanel);
        add(ppanel);
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

        ppanel.setBounds(540,0,330,600);
        ppanel.setBackground(YELLOW);
        ljudul.setBounds(180,60,200,30);
        lid_bagian.setBounds(30,100,80,20);
        tfid_bagian.setBounds(110,100,100,20);
        tfid_bagian.setEnabled(false);
        lnama.setBounds(30,130,80,20);
        tfnama.setBounds(110,130,100,20);
        lusername.setBounds(30,160,80,20);
        tfusername.setBounds(110,160,100,20);
        lpassword.setBounds(30,190,80,20);
        tfpassword.setBounds(110,190,100,20);
        btntambah.setBounds(150,230,100,30);
        btnbatal.setBounds(30,230,100,30);
    }
}

package View;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tampilanCreatePegawai extends JFrame {
    Font fjudul,fkata;
    JLabel ljudul,lnama, lid_bagian,lusername,lpassword,lsamadengan1,lsamadengan2,lsamadengan3;
    public JTextField tfnama, tfid_bagian, tfusername, tfpassword ;
    public JButton btntambah,btnbatal;

    public tampilanCreatePegawai () {
        setSize(300,375);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.PINK);
        setTitle("Create Pegawai");

        fjudul = new Font("Tahoma", Font.BOLD , 18);
        fkata= new Font("Calibri", Font.BOLD,16);
        ljudul = new JLabel("CREATE DATA");  ljudul.setFont(fjudul);
        lsamadengan1 = new JLabel("");
        lsamadengan2 = new JLabel("");
        lsamadengan3 = new JLabel("");
        lnama = new JLabel("Nama"); lnama.setFont(fkata);
        lid_bagian = new JLabel("Bagian"); lid_bagian.setFont(fkata);
        lusername = new JLabel("Username"); lusername.setFont(fkata);
        lpassword = new JLabel("Password"); lpassword.setFont(fkata);
        tfnama = new JTextField();
        tfid_bagian = new JTextField();
        tfusername = new JTextField();
        tfpassword = new JTextField();
        btnbatal = new JButton("Cancel");
        btntambah = new JButton("Submit");

        add(ljudul);
        add(lsamadengan1);
        add(lsamadengan2);
        add(lsamadengan3);
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

        lsamadengan1.setBounds(0,25,300,5);
        lsamadengan2.setBounds(0,60,300,5);
        ljudul.setBounds(80,60,200,30);
        lnama.setBounds(30,100,80,20);
        tfnama.setBounds(100,100,150,20);
        lid_bagian.setBounds(30,130,80,20);
        tfid_bagian.setBounds(100,130,150,20);
        lusername.setBounds(30,160,80,20);
        tfusername.setBounds(100,160,150,20);
        lpassword.setBounds(30,190,80,20);
        tfpassword.setBounds(100,190,150,20);
        btntambah.setBounds(150,230,100,30);
        btntambah.setBackground(Color.BLUE);
        btntambah.setForeground(Color.WHITE);
        btnbatal.setBounds(30,230,100,30);
        btnbatal.setBackground(Color.RED);
        btnbatal.setForeground(Color.WHITE);
        lsamadengan3.setBounds(0,280,300,5);
    }
}

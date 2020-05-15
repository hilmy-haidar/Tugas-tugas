package View;

import javax.swing.*;
import java.awt.*;

public class tampilanUpdatePegawai extends JFrame {
    Font fjudul ;
    JLabel ljudul, lnama, lid_bagian, lusername, lpassword, lsamadengan1,lsamadengan2;
    public JTextField tfnama, tfid_bagian , tfusername , tfpassword;
    public JButton btnedit, btnkembali ;

    public tampilanUpdatePegawai () {
        fjudul = new Font("Tahoma", Font.BOLD , 21);
        ljudul = new JLabel("EDIT PEGAWAI"); ljudul.setFont(fjudul);
        lsamadengan1 = new JLabel("");
        lsamadengan2 = new JLabel("");
        lnama = new JLabel("Nama");
        lid_bagian = new JLabel("Bagian");
        lusername = new JLabel("Username");
        lpassword = new JLabel("Password");
        tfnama = new JTextField();
        tfid_bagian = new JTextField();
        tfusername = new JTextField();
        tfpassword = new JTextField();
        btnedit = new JButton("Submit");
        btnkembali = new JButton("Cancel");

        setTitle("Data Pegawai");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(360,360);
        getContentPane().setBackground(Color.PINK);
        setLocationRelativeTo(null);

        add(lsamadengan1);
        lsamadengan1.setBounds(0,40,360,5);
        add(lsamadengan2);
        lsamadengan2.setBounds(0,80,360,5);
        add(ljudul);
        ljudul.setBounds(100,50,200,20);
        add(lnama);
        lnama.setBounds(20,110,60,20);
        add(tfnama);
        tfnama.setBounds(100,110,200,20);
        add(lid_bagian);
        lid_bagian.setBounds(20,140,60,20);
        add(tfid_bagian);
        tfid_bagian.setBounds(100,140,200,20);
        add(lusername);
        lusername.setBounds(20,170,60,20);
        add(tfusername);
        tfusername.setBounds(100,170,200,20);
        add(lpassword);
        lpassword.setBounds(20,200,60,20);
        add(tfpassword);
        tfpassword.setBounds(100,200,200,20);

        add(btnkembali);
        btnkembali.setBounds(80,250,100,30);
        btnkembali.setForeground(Color.WHITE);
        btnkembali.setBackground(Color.RED);
        add(btnedit);
        btnedit.setBounds(180,250,100,30);
        btnedit.setForeground(Color.white);
        btnedit.setBackground(Color.BLUE);


    }
}

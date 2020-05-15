package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tampilanMain extends JFrame{
    Font fjudul;
    JLabel  ljudul;
    public JButton btnbuatKontak,btnlihatKontak,btnexit;

    public tampilanMain () {

        setLayout(null);
        setVisible(false);
        setSize(300,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.PINK);
        setBackground(new java.awt.Color(204,204,204));
        setTitle("Pegawai");

        fjudul = new Font("Calibri", Font.BOLD , 21);
        ljudul = new JLabel("Silahkan Pilih!");
        ljudul.setFont(fjudul);

        btnbuatKontak = new JButton("Create Data Pegawai");
        btnlihatKontak = new JButton("Read Data Pegawai");
        btnexit = new JButton("Exit");

        add(ljudul);

        add(btnbuatKontak);
        add(btnexit);
        add(btnlihatKontak);

        ljudul.setBounds(85,70,160,20);

        btnbuatKontak.setBounds(50,100,190,30);
        btnbuatKontak.setBackground(Color.DARK_GRAY);
        btnbuatKontak.setForeground(Color.white);
        btnlihatKontak.setBounds(50,150,190,30);
        btnlihatKontak.setBackground(Color.BLUE);
        btnlihatKontak.setForeground(Color.white);
        btnexit.setBounds(50,200,190,30);
        btnexit.setBackground(Color.RED);
        btnexit.setForeground(Color.white);
    }

}



package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tampilanMain2 extends JFrame{
    Font fjudul;
    JLabel  ljudul;
    public JButton btnbuatKontaks,btnlihatKontaks,btnexit;

    public tampilanMain2 () {

        setLayout(null);
        setVisible(false);
        setSize(300,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.PINK);
        setBackground(new java.awt.Color(204,204,204));
        setTitle("Jasa");

        fjudul = new Font("Calibri", Font.BOLD , 21);
        ljudul = new JLabel("Silahkan Pilih!");
        ljudul.setFont(fjudul);

        btnbuatKontaks = new JButton("Create Data Service");
        btnlihatKontaks = new JButton("Read Data Service");
        btnexit = new JButton("Exit");

        add(ljudul);

        add(btnbuatKontaks);
        add(btnexit);
        add(btnlihatKontaks);

        ljudul.setBounds(87,70,160,20);

        btnbuatKontaks.setBounds(50,100,190,30);
        btnbuatKontaks.setBackground(Color.darkGray);
        btnbuatKontaks.setForeground(Color.white);
        btnlihatKontaks.setBounds(50,150,190,30);
        btnlihatKontaks.setForeground(Color.white);
        btnlihatKontaks.setBackground(Color.blue);
        btnexit.setBounds(50,200,190,30);
        btnexit.setBackground(Color.RED);
        btnexit.setForeground(Color.WHITE);
    }

}



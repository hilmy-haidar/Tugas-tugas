import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OutputMain extends JFrame{
    Font fjudul;
    JLabel  ljudul;
    JButton btnCreateKontak,btnReadKontak;

    public OutputMain () {

        setLayout(null);
        setVisible(true);
        setSize(500,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.PINK);
        setLocationRelativeTo(null);
        setBackground(new java.awt.Color(204, 202, 78));
        setTitle("Main Menu");

        fjudul = new Font("Broadway", Font.BOLD , 21);
        ljudul = new JLabel("MENU");
        ljudul.setFont(fjudul);
        btnCreateKontak = new JButton("Create Data");
        btnReadKontak = new JButton("Read Data");


        add(ljudul);
        add(btnCreateKontak);
        add(btnReadKontak);

        ljudul.setBounds(200,150,160,20);
        btnCreateKontak.setBounds(150,200,190,30);
        btnCreateKontak.setBackground(Color.green);
        btnReadKontak.setBounds(150,250,190,30);
        btnReadKontak.setBackground(Color.blue);
        btnReadKontak.setForeground(Color.white);

    }

}

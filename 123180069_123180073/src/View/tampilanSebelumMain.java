package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tampilanSebelumMain extends JFrame{
    Font fjudul;
    JLabel  ljudul;
    public JButton btnPegawai,btnService,btnTransaksi,btnexit;

    public tampilanSebelumMain () {
        setLayout(null);
        setVisible(true);
        setSize(300,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(new java.awt.Color(204,204,204));
        getContentPane().setBackground(Color.PINK);
        setTitle("menu utama");

        fjudul = new Font("Tahoma", Font.BOLD , 21);
        ljudul = new JLabel("PILIH");
        ljudul.setFont(fjudul);

        btnPegawai = new JButton("Pegawai");
        btnService = new JButton("Service");
        btnTransaksi = new JButton("Transaksi");
        btnexit = new JButton("Exit");

        add(ljudul);
        add(btnPegawai);
        add(btnService);
        add(btnTransaksi);

        ljudul.setBounds(110,70,160,20);

        btnPegawai.setBounds(50,100,190,30);
        btnService.setBounds(50,150,190,30);
        btnTransaksi.setBounds(50,200,190,30);
        /*btnexit.setBounds(50,200,190,30);*/
    }

}



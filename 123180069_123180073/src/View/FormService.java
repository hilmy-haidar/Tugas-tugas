package View;

import javax.swing.*;
import java.awt.*;

public class FormService extends JFrame {
    Font fjudul, fkata;
    JLabel ljudul, lnama_pelanggan, lid_bagian, lusername, lpassword, lsamadengan1, lsamadengan2, lsamadengan3;
    JTextField tfnama_pelanggan, tfid_bagian, tfusername, tfpassword;
    JButton btntambah, btnbatal;

    public FormService() {
        setSize(300, 375);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("TAMBAH KONTAK");

        fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 18);
        fkata = new Font("Italic", Font.ITALIC, 14);
        ljudul = new JLabel("CREATE DATA PEGAWAI");
        ljudul.setFont(fjudul);
        lsamadengan1 = new JLabel("==========================================");
        lsamadengan2 = new JLabel("==========================================");
        lsamadengan3 = new JLabel("==========================================");
        lnama_pelanggan = new JLabel("Nama");
        lnama_pelanggan.setFont(fkata);
        lid_bagian = new JLabel("ID Bagian");
        lid_bagian.setFont(fkata);
        lusername = new JLabel("Username");
        lusername.setFont(fkata);
        lpassword = new JLabel("Password");
        lpassword.setFont(fkata);
        tfnama_pelanggan = new JTextField();
        tfid_bagian = new JTextField();
        tfusername = new JTextField();
        tfpassword = new JTextField();
        btnbatal = new JButton("Batal");
        btntambah = new JButton("Buat");

        add(ljudul);
        add(lsamadengan1);
        add(lsamadengan2);
        add(lsamadengan3);
        add(lnama_pelanggan);
        add(lid_bagian);
        add(lusername);
        add(lpassword);
        add(tfnama_pelanggan);
        add(tfid_bagian);
        add(tfusername);
        add(tfpassword);
        add(btnbatal);
        add(btntambah);

        lsamadengan1.setBounds(0, 25, 300, 5);
        lsamadengan2.setBounds(0, 60, 300, 5);
        ljudul.setBounds(65, 30, 200, 30);
        lnama_pelanggan.setBounds(30, 100, 80, 20);
        tfnama_pelanggan.setBounds(100, 100, 150, 20);
        lid_bagian.setBounds(30, 130, 80, 20);
        tfid_bagian.setBounds(100, 130, 150, 20);
        lusername.setBounds(30, 160, 80, 20);
        tfusername.setBounds(100, 160, 150, 20);
        lpassword.setBounds(30, 190, 80, 20);
        tfpassword.setBounds(100, 190, 150, 20);
        btntambah.setBounds(150, 230, 100, 30);
        btnbatal.setBounds(30, 230, 100, 30);
        lsamadengan3.setBounds(0, 280, 300, 5);
    }
}

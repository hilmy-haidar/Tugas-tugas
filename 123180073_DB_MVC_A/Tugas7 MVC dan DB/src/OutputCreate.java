import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class OutputCreate extends JFrame {
    Font fJudul,fKata;
    JLabel lJudul, lNama, lNo, lUmur,lEmail;
    JTextField tfNama, tfNo, tfUmur, tfEmail;
    JButton bTambah, bBatal;

    public OutputCreate(){
        setSize(700, 500);
        getContentPane().setBackground(PINK);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Create");

        fJudul = new Font("Algerian", Font.BOLD, 20);
        fKata = new Font("Tahoma", Font.CENTER_BASELINE, 14);
        lJudul = new JLabel("Form Pengisian"); lJudul.setFont(fJudul);
        lNama = new JLabel("Nama"); lNama.setFont(fKata);
        lNo = new JLabel("No.HP"); lNo.setFont(fKata);
        lUmur = new JLabel("Umur"); lUmur.setFont(fKata);
        lEmail = new JLabel("Email"); lEmail.setFont(fKata);

        tfNama = new JTextField();
        tfNo = new JTextField();
        tfUmur = new JTextField();
        tfEmail = new JTextField();

        bBatal = new JButton("Cancel");
        bTambah = new JButton("Submit");

        bBatal.setBackground(Color.red);
        bBatal.setForeground(white);
        bTambah.setBackground(green);
        bTambah.setForeground(black);
        add(lJudul);
        add(lNama);
        add(lNo);
        add(lUmur);
        add(lEmail);
        add(tfNama);
        add(tfNo);
        add(tfUmur);
        add(tfEmail);
        add(bBatal);
        add(bTambah);

        lJudul.setBounds(280,30,200,30);
        lNama.setBounds(200,100,80,20);
        tfNama.setBounds(260,100,225,20);
        lNo.setBounds(200,130,80,20);
        tfNo.setBounds(260,130,225,20);
        lUmur.setBounds(200,160,80,20);
        tfUmur.setBounds(260,160,225,20);
        lEmail.setBounds(200,190,80,20);
        tfEmail.setBounds(260,190,225,20);
        bTambah.setBounds(280,230,90,30);
        bBatal.setBounds(  380,230,90,30);
    }
}

package View;

import javax.swing.*;
import java.awt.*;

public class tampilanUpdateService extends JFrame {
    Font fjudul ;
    JLabel ljudul, lnama_service, lid_jenis, lharga, lsamadengan1,lsamadengan2;
    public JTextField tfnama_service, tfid_jenis , tfharga ;
    public JButton btnedits, btnkembalis ;

    public tampilanUpdateService() {
        fjudul = new Font("Tahoma", Font.BOLD + Font.ITALIC, 21);
        ljudul = new JLabel("EDIT JASA"); ljudul.setFont(fjudul);
        lsamadengan1 = new JLabel("");
        lsamadengan2 = new JLabel("");
        lnama_service = new JLabel("Jasa");
        lid_jenis = new JLabel("ID Jasa");
        lharga = new JLabel("Harga");
        tfnama_service = new JTextField();
        tfid_jenis = new JTextField();
        tfharga = new JTextField();
        btnedits = new JButton("Submit");
        btnkembalis = new JButton("Cancel");

        setTitle("Data Jasa");
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
        add(lnama_service);
        lnama_service.setBounds(20,110,60,20);
        add(tfnama_service);
        tfnama_service.setBounds(100,110,200,20);
        add(lid_jenis);
        lid_jenis.setBounds(20,140,60,20);
        add(tfid_jenis);
        tfid_jenis.setBounds(100,140,200,20);
        add(lharga);
        lharga.setBounds(20,170,60,20);
        add(tfharga);
        tfharga.setBounds(100,170,200,20);

        add(btnkembalis);
        btnkembalis.setBounds(80,250,100,30);
        btnkembalis.setForeground(Color.WHITE);
        btnkembalis.setBackground(Color.RED);
        add(btnedits);
        btnedits.setBounds(180,250,100,30);
        btnedits.setForeground(Color.white);
        btnedits.setBackground(Color.BLUE);


    }
}

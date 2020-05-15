package View;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tampilanCreateService extends JFrame {
    Font fjudul,fkata;
    JLabel ljudul,lnama_service, lid_jenis,lharga,lsamadengan1,lsamadengan2,lsamadengan3;
    public JTextField tfnama_service, tfid_jenis, tfharga ;
    public JButton btntambahs,btnbatals;

    public tampilanCreateService () {

        setSize(300,375);
        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.PINK);
        setTitle("Create Service");

        fjudul = new Font("Tahoma", Font.BOLD , 18);
        fkata= new Font("Calibri", Font.BOLD,16);
        ljudul = new JLabel("CREATE DATA JASA");  ljudul.setFont(fjudul);
        lsamadengan1 = new JLabel("");
        lsamadengan2 = new JLabel("");
        lsamadengan3 = new JLabel("");
        lnama_service = new JLabel("Jasa"); lnama_service.setFont(fkata);
        lid_jenis = new JLabel("Kode Jasa"); lid_jenis.setFont(fkata);
        lharga = new JLabel("Harga"); lharga.setFont(fkata);
        tfnama_service = new JTextField();
        tfid_jenis = new JTextField();
        tfharga = new JTextField();
        btnbatals = new JButton("Batal");
        btntambahs = new JButton("Buat");

        add(ljudul);
        add(lsamadengan1);
        add(lsamadengan2);
        add(lsamadengan3);
        add(lnama_service);
        add(lid_jenis);
        add(lharga);

        add(tfnama_service);
        add(tfid_jenis);
        add(tfharga);

        add(btnbatals);
        add(btntambahs);

        lsamadengan1.setBounds(0,25,300,5);
        lsamadengan2.setBounds(0,60,300,5);
        ljudul.setBounds(80,60,200,30);
        lnama_service.setBounds(30,100,80,20);
        tfnama_service.setBounds(100,100,150,20);
        lid_jenis.setBounds(30,130,80,20);
        tfid_jenis.setBounds(100,130,150,20);
        lharga.setBounds(30,160,80,20);
        tfharga.setBounds(100,160,150,20);

        btntambahs.setBounds(150,230,100,30);
        btntambahs.setBackground(Color.BLUE);
        btntambahs.setForeground(Color.WHITE);
        btnbatals.setBounds(30,230,100,30);
        btnbatals.setBackground(Color.RED);
        btnbatals.setForeground(Color.WHITE);
        lsamadengan3.setBounds(0,280,300,5);



    }
}

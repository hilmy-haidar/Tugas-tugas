import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import static java.awt.Color.*;

public class OutputRead extends JFrame {
    JPanel panel = new JPanel();
    JPanel panelin = new JPanel();
    JLabel lJudul,  lPilihan, lNama, lNo, lUmur, lEmail, lNamaisi, lNoisi,lUmurisi,lEmailisi,lId;
    JTextField tfsearch;
    Font fJudul,  fPilihan,fPilihan1;
    JTable table;
    JButton bTambah, bKembali, bHapus, bUpdate, bRefresh, bSearch;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"nama","no_hp","umur","email",""};
    GroupLayout gpanel, gpanelin;

    public OutputRead() {
        fJudul = new Font("Tahoma", Font.BOLD, 20);

        fPilihan = new Font("Tahoma", Font.BOLD , 17);
        fPilihan1 = new Font("Tahoma", Font.BOLD , 17);
        lJudul = new JLabel("DATA KONTAK");
        lJudul.setFont(fJudul);
        lNama = new JLabel("Nama :");
        lNo = new JLabel("No.HP :");
        lUmur = new JLabel("Umur :");
        lEmail = new JLabel("Email :");
        lId = new JLabel();

        lNamaisi = new JLabel();
        lNoisi = new JLabel();
        lUmurisi = new JLabel();
        lEmailisi = new JLabel();

        tableModel = new DefaultTableModel(namaKolom, 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        bSearch = new JButton("Search By Name");
        tfsearch = new JTextField();
        bTambah = new JButton("Input");
        bKembali = new JButton("Back To Main Menu");
        bHapus = new JButton("Delete");
        bUpdate = new JButton("Update");
        bRefresh = new JButton("Reset");

        panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        gpanel = new GroupLayout(panel);
        panel.setLayout(gpanel);
        //panelin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detail Contact", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
        gpanelin = new GroupLayout(panelin);
        panelin.setLayout(gpanelin);
        lPilihan = new JLabel("Data Yang Dipilih");

        lPilihan.setFont(fPilihan);


        setTitle("Read Data");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(900, 600);
        getContentPane().setBackground(PINK);
        setLocationRelativeTo(null);

        add(panel);
        panel.add(lPilihan);
        panel.add(bTambah);
        panel.add(bKembali);
        panel.add(bHapus);
        panel.add(bUpdate);
        panel.add(bRefresh);
        panel.add(panelin);

        panelin.add(lNama);
        panelin.add(lNo);
        panelin.add(lUmur);
        panelin.add(lEmail);
        panelin.add(lNamaisi);
        panelin.add(lNoisi);
        panelin.add(lUmurisi);
        panelin.add(lEmailisi);

        add(lJudul);

        add(scrollPane);
        add(bSearch);
        add(tfsearch);
        bRefresh.setBackground(yellow);
        bUpdate.setBackground(black);
        bUpdate.setForeground(white);
        bHapus.setBackground(blue);
        bHapus.setForeground(white);
        bTambah.setBackground(Color.pink);
        bKembali.setBackground(WHITE);
        bSearch.setBackground(green);
        panelin.setBackground(white);
        panel.setBackground(YELLOW);

        panel.setBounds(540, 50, 330, 480);
        panelin.setBounds(30, 70, 275, 150);
        lPilihan.setBounds(100, 30, 200, 20);
        bRefresh.setBounds(120, 200, 100, 20);
        bUpdate.setBounds(60, 250, 100, 30);
        bHapus.setBounds(180, 250, 100, 30);
        bTambah.setBounds(110, 360, 150, 30);
        bKembali.setBounds(110, 400, 150, 30);
        lJudul.setBounds(220, 20, 160, 20);

        scrollPane.setBackground(pink);
        scrollPane.setBounds(50,100,470,430);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        tfsearch.setBounds(50,60,250,20);
        bSearch.setBounds(300,60,150,20);

        lNama.setBounds(20,25,80,20);
        lNamaisi.setBounds(80,25,200,20);
        lNo.setBounds(20,50, 80, 20);
        lNoisi.setBounds(80,50,200,20);
        lUmur.setBounds(20,75,80,20);
        lUmurisi.setBounds(80,75,200,20);
        lEmail.setBounds(20,100,80,20);
        lEmailisi.setBounds(80,100,200,20);
        bHapus.setEnabled(false);
        bUpdate.setEnabled(false);
    }
}

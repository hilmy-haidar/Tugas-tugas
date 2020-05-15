package View;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import static java.awt.Color.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class tampilanLihatService extends JFrame{


    JPanel ppanel= new JPanel();
    JPanel ppaneldalam = new JPanel();
    public JLabel ljudul, lmenupilihan,lnama_service,lid_jenis,lharga,lnama_serviceisi,lid_jenisisi,lhargaisi,lpasswordisi,lid;
    public JTextField tfsearchs;
    Font fjudul,fmenupilihan;
    public JTable tabel ;
    public JButton btntambahs , btnkembalis, btnhapuss, btnupdates,btnrefreshs,btnsearchs;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    public Object namaKoloms [] =  {"nama service","id jenis","harga",""} ;
    GroupLayout gppanel,gppaneldalam;

    public tampilanLihatService() {
        fjudul = new Font("Arial Black", Font.BOLD , 21);
        fmenupilihan = new Font("Broadway", Font.BOLD , 21);
        ljudul = new JLabel("DAFTAR JASA"); ljudul.setFont(fjudul); ljudul.setFont(fjudul);ljudul.setForeground(white);
        lnama_service = new JLabel("Nama    :");
        lharga = new JLabel("Harga    :");
        lid_jenis = new JLabel("Id Jenis  :");
        lid = new JLabel();
        lnama_serviceisi = new JLabel();
        lhargaisi = new JLabel();
        lpasswordisi = new JLabel();
        lid_jenisisi = new JLabel();
        tabelModel = new DefaultTableModel(namaKoloms,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        btnsearchs = new JButton("Cari");
        tfsearchs = new JTextField();
        btntambahs = new JButton("Tambah");
        btnkembalis = new JButton("Kembali");
        btnhapuss = new JButton("Hapus");
        btnupdates = new JButton("Edit");
        btnrefreshs = new JButton("Refresh");
        ppanel.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gppanel = new GroupLayout(ppanel);
        ppanel.setLayout(gppanel);
        ppaneldalam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Terpilih", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        gppaneldalam = new GroupLayout(ppaneldalam);
        ppaneldalam.setLayout(gppaneldalam);
        lmenupilihan = new JLabel("INFO DATA"); lmenupilihan.setFont(fmenupilihan);

        setTitle("Data Jasa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(false);
        setLayout(null);
        setSize(900,600);
        getContentPane().setBackground(BLUE);
        setLocationRelativeTo(null);

        add(ppanel);
        ppanel.add(lmenupilihan);
        ppanel.add(btntambahs);
        ppanel.add(btnkembalis);
        ppanel.add(btnhapuss);
        ppanel.add(btnupdates);
        ppanel.add(btnrefreshs);
        ppanel.add(ppaneldalam);
        ppaneldalam.add(lnama_service);
        ppaneldalam.add(lharga);
        ppaneldalam.add(lid_jenis);
        ppaneldalam.add(lnama_serviceisi);
        ppaneldalam.add(lhargaisi);
        ppaneldalam.add(lid_jenisisi);
        ppaneldalam.add(lpasswordisi);
        add(ljudul);
        add(scrollPane);
        add(btnsearchs);
        add(tfsearchs);

        ppanel.setBounds(540,50,330,480);
        ppanel.setBackground(ORANGE);
        ppaneldalam.setBounds(30,70,275,200);
        lmenupilihan.setBounds(105,30,170,20);
        btntambahs.setBounds(170,400,100,30);
        btnkembalis.setBounds(70,400,100,30);
        btnhapuss.setBounds(170,340,100,30);
        btnupdates.setBounds(70,340,100,30);
        btnrefreshs.setBounds(120,280,100,20);
        ljudul.setBounds(220,20,250,20);

        scrollPane.setBounds(50,100,470,430);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        tfsearchs.setBounds(50,60,370,20);
        btnsearchs.setBounds(420,60,100,20);

        lnama_service.setBounds(20,50,80,20);
        lid_jenis.setBounds(20,80,80,20);
        lharga.setBounds(20,110,80,20);
        lnama_serviceisi.setBounds(95,50,200,20);
        lid_jenisisi.setBounds(95,80,200,20);
        lhargaisi.setBounds(95,110,200,20);
        lpasswordisi.setBounds(95,140,200,20);
        btnhapuss.setEnabled(false);
        btnupdates.setEnabled(false);


    }
}

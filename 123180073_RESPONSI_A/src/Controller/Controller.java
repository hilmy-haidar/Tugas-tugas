package Controller;
import Model.Model;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {
    String nama_anggota, id_anggota, id_buku, judul_buku;
    String nama_service, id_jenis, harga;
    public Controller(Model model,ViewMenu viewmenu, ViewPinjam viewpinjam,ViewAbout viewabout,ViewTampil viewtampil,ViewEdit viewedit){
   // public Controller(tampilanSebelumMain tampilansebelummain, Model model, tampilanMain tampilanmain, tampilanMain2 tampilanmain2, tampilanCreatePegawai tampilancreatepegawai, tampilanLihatPegawai tampilanlihatpegawai, tampilanUpdatePegawai tampilanupdatepegawai, tampilanCreateService tampilancreateservice, tampilanLihatService tampilanlihatservice, tampilanUpdateService tampilanupdateservice) {

        viewmenu.btnPinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(true);
                viewmenu.setVisible(false);
            }
        });

        viewmenu.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(true);
                viewmenu.setVisible(false);
            }
        });

        viewmenu.btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datakontak[][] = model.readContact();
                viewtampil.tabel.setModel((new JTable(datakontak, viewtampil.namaKolom)).getModel());
                viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                viewtampil.setVisible(true);
                viewmenu.setVisible(false);
            }
        });

        viewpinjam.btntambah.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_anggota = viewpinjam.tfnama.getText();
                String id_anggota = viewpinjam.tfid_bagian.getText();
                String id_buku = viewpinjam.tfusername.getText();
                String judul_buku = viewpinjam.tfpassword.getText();
                model.insertContact(id_anggota,nama_anggota , id_buku, judul_buku);
            }
        });

        viewpinjam.btnbatal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                viewmenu.setVisible(true);
            }
        });

        viewpinjam.btnhome.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                viewmenu.setVisible(true);
            }
        });

        viewpinjam.btnPinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(true);
                viewmenu.setVisible(false);
            }
        });

        viewpinjam.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                viewabout.setVisible(true);
            }
        });

        viewpinjam.btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datakontak[][] = model.readContact();
                viewtampil.tabel.setModel((new JTable(datakontak, viewtampil.namaKolom)).getModel());
                viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                viewpinjam.setVisible(false);
                viewtampil.setVisible(true);
            }
        });

        viewabout.btnhome.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                viewmenu.setVisible(true);
            }
        });

        viewabout.btnPinjam.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                viewpinjam.setVisible(true);
            }
        });

        viewabout.btnTampil.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String datakontak[][] = model.readContact();
                viewtampil.tabel.setModel((new JTable(datakontak, viewtampil.namaKolom)).getModel());
                viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                viewabout.setVisible(false);
                viewtampil.setVisible(true);
            }
        });

        if (model.getContact() != 0) {
            // menampilkan tabel di awal
            String datakontak[][] = model.readContact();
            viewtampil.tabel.setModel((new JTable(datakontak, viewtampil.namaKolom)).getModel());
            viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
            viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);

        } else {
            int input = JOptionPane.showConfirmDialog(null, "Kontak belum ada, apakah anda ingin membuat kontak baru ? ", "Pilih opsi", JOptionPane.YES_NO_OPTION);

            if (input == 0) {
                viewtampil.dispose();
                ;
                viewpinjam.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Tidak jadi buat kontak");
            }
        }

        viewtampil.btnPinjam.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                viewpinjam.setVisible(true);
            }
        });

        viewtampil.btnAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                viewabout.setVisible(true);
            }
        });

        viewtampil.btnhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                viewmenu.setVisible(true);
            }
        });

        viewtampil.tabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewtampil.tabel.getSelectedRow();
                int kolom = viewtampil.tabel.getSelectedColumn();

                String dataterpilih = viewtampil.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                viewtampil.lid_bagianisi.setText(viewtampil.tabel.getValueAt(baris, 0).toString());
                viewtampil.lnamaisi.setText(viewtampil.tabel.getValueAt(baris, 1).toString());
                viewtampil.lusernameisi.setText(viewtampil.tabel.getValueAt(baris, 2).toString());
                viewtampil.lpasswordisi.setText(viewtampil.tabel.getValueAt(baris, 3).toString());

                id_anggota = viewtampil.lid_bagianisi.getText();
                nama_anggota = viewtampil.lnamaisi.getText();
                id_buku = viewtampil.lusernameisi.getText();
                judul_buku = viewtampil.lpasswordisi.getText();

                viewtampil.btnupdate.setEnabled(true);
                viewtampil.btnhapus.setEnabled(true);

            }
        });

        viewtampil.btnupdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                viewedit.setVisible(true);
                viewtampil.setVisible(false);
                viewedit.tfid_bagian.setText(id_anggota);
                viewedit.tfnama.setText(nama_anggota);
                viewedit.tfusername.setText(id_buku);
                viewedit.tfpassword.setText(judul_buku);
            }
        });

        viewedit.btntambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id_anggota = viewedit.tfid_bagian.getText();
                String nama_anggota = viewedit.tfnama.getText();
                String id_buku = viewedit.tfusername.getText();
                String judul_buku = viewedit.tfpassword.getText();


                model.updateKontak(id_anggota, nama_anggota, id_buku, judul_buku);
                String contact[][] = model.readContact();
                viewtampil.tabel.setModel(new JTable(contact, viewtampil.namaKolom).getModel());
                viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                viewedit.setVisible(false);
                viewtampil.setVisible(true);
            }
        });

        viewedit.btnbatal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                viewtampil.setVisible(true);
            }
        });

        viewtampil.btnhapus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                model.hapusKontak(id_anggota);
                String datakontak[][] = model.readContact();
                viewtampil.tabel.setModel((new JTable(datakontak, viewtampil.namaKolom)).getModel());
                viewtampil.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                viewtampil.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                viewtampil.lnamaisi.setText(null);
                viewtampil.lpasswordisi.setText(null);
                viewtampil.lusernameisi.setText(null);
                viewtampil.lid_bagianisi.setText(null);
            }
        });

        }
}


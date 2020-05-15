package Controller;

import MVC.MVCTransaksi;
import Model.Model;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {
    String nama, id_bagian, username, password;
    String nama_service, id_jenis, harga;

    public Controller(tampilanSebelumMain tampilansebelummain, Model model, tampilanMain tampilanmain, tampilanMain2 tampilanmain2, tampilanCreatePegawai tampilancreatepegawai, tampilanLihatPegawai tampilanlihatpegawai, tampilanUpdatePegawai tampilanupdatepegawai, tampilanCreateService tampilancreateservice, tampilanLihatService tampilanlihatservice, tampilanUpdateService tampilanupdateservice) {

        //ngisi data
        if (model.getContact() != 0) {
            // menampilkan tabel di awal
            String datakontak[][] = model.readContact();
            tampilanlihatpegawai.tabel.setModel((new JTable(datakontak, tampilanlihatpegawai.namaKolom)).getModel());
            tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMinWidth(0);
            tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMaxWidth(0);

        } else {
            int input = JOptionPane.showConfirmDialog(null, "Kontak belum ada, apakah anda ingin membuat kontak baru ? ", "Pilih opsi", JOptionPane.YES_NO_OPTION);

            if (input == 0) {
                tampilanmain.dispose();
                ;
                tampilancreatepegawai.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Tidak jadi buat kontak");
            }
        }

        if (model.getContacts() != 0) {
            // menampilkan tabel di awal
            String datakontaks[][] = model.readContacts();
            tampilanlihatservice.tabel.setModel((new JTable(datakontaks, tampilanlihatservice.namaKoloms)).getModel());
            tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMinWidth(0);
            tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMaxWidth(0);

        } else {
            int input = JOptionPane.showConfirmDialog(null, "Kontak belum ada, apakah anda ingin membuat kontak baru ? ", "Pilih opsi", JOptionPane.YES_NO_OPTION);

            if (input == 0) {
                tampilanmain2.dispose();
                ;
                tampilancreateservice.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak jadi buat kontak");
                }
        }

        tampilansebelummain.btnPegawai.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanmain.setVisible(true);
                tampilansebelummain.setVisible(false);
            }
        });

        tampilansebelummain.btnService.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanmain2.setVisible(true);
                tampilansebelummain.setVisible(false);
            }
        });

        tampilansebelummain.btnTransaksi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           MVCTransaksi mvcTransaksi = new MVCTransaksi();
               /* view.setVisible(true);*/
                tampilansebelummain.setVisible(false);
            }
        });

        tampilanmain.btnbuatKontak.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilancreatepegawai.setVisible(true);
                tampilanmain.setVisible(false);
            }
        });

        tampilanmain2.btnbuatKontaks.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilancreateservice.setVisible(true);
                tampilanmain.setVisible(false);
            }
        });


        tampilancreatepegawai.btntambah.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tampilancreatepegawai.tfnama.getText();
                String id_bagian = tampilancreatepegawai.tfid_bagian.getText();
                String username = tampilancreatepegawai.tfusername.getText();
                String password = tampilancreatepegawai.tfpassword.getText();
                model.insertContact(nama, id_bagian, username, password);

                String contact[][] = model.readContact();
                tampilanlihatpegawai.tabel.setModel(new JTable(contact, tampilanlihatpegawai.namaKolom).getModel());
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                tampilancreatepegawai.setVisible(false);
                tampilanlihatpegawai.setVisible(true);
                tampilancreatepegawai.tfpassword.setText(null);
                tampilancreatepegawai.tfnama.setText(null);
                tampilancreatepegawai.tfid_bagian.setText(null);
                tampilancreatepegawai.tfusername.setText(null);
            }
        });

        tampilancreateservice.btntambahs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_service = tampilancreateservice.tfnama_service.getText();
                String id_jenis = tampilancreateservice.tfid_jenis.getText();
                String harga = tampilancreateservice.tfharga.getText();
                model.insertContacts(nama_service, id_jenis, harga);

                String contact[][] = model.readContacts();
                tampilanlihatservice.tabel.setModel(new JTable(contact, tampilanlihatservice.namaKoloms).getModel());
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMinWidth(0);
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMaxWidth(0);
                tampilancreateservice.setVisible(false);
                tampilanlihatservice.setVisible(true);
                tampilancreateservice.tfnama_service.setText(null);
                tampilancreateservice.tfid_jenis.setText(null);
                tampilancreateservice.tfharga.setText(null);
            }
        });

        tampilancreatepegawai.btnbatal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilancreatepegawai.setVisible(false);
                tampilanmain.setVisible(true);
            }
        });

        tampilancreateservice.btnbatals.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilancreateservice.setVisible(false);
                tampilanmain2.setVisible(true);
            }
        });

        tampilanmain.btnlihatKontak.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanmain.setVisible(false);
                tampilanlihatpegawai.setVisible(true);
            }
        });

        tampilanmain2.btnlihatKontaks.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanmain2.setVisible(false);
                tampilanlihatservice.setVisible(true);
            }
        });

        tampilanlihatpegawai.btntambah.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanlihatpegawai.setVisible(false);
                tampilancreatepegawai.setVisible(true);
            }
        });
        tampilanlihatservice.btntambahs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanlihatservice.setVisible(false);
                tampilancreateservice.setVisible(true);
            }
        });

        tampilanlihatpegawai.btnkembali.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanlihatpegawai.setVisible(false);
                tampilanmain.setVisible(true);
            }
        });
        tampilanlihatservice.btnkembalis.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanlihatservice.setVisible(false);
                tampilanmain2.setVisible(true);
            }
        });

        tampilanlihatpegawai.tabel.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = tampilanlihatpegawai.tabel.getSelectedRow();
                int kolom = tampilanlihatpegawai.tabel.getSelectedColumn();

                String dataterpilih = tampilanlihatpegawai.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                tampilanlihatpegawai.lnamaisi.setText(tampilanlihatpegawai.tabel.getValueAt(baris, 0).toString());
                tampilanlihatpegawai.lid_bagianisi.setText(tampilanlihatpegawai.tabel.getValueAt(baris, 1).toString());
                tampilanlihatpegawai.lusernameisi.setText(tampilanlihatpegawai.tabel.getValueAt(baris, 2).toString());
                tampilanlihatpegawai.lpasswordisi.setText(tampilanlihatpegawai.tabel.getValueAt(baris, 3).toString());

                nama = tampilanlihatpegawai.lnamaisi.getText();
                id_bagian = tampilanlihatpegawai.lid_bagianisi.getText();
                username = tampilanlihatpegawai.lusernameisi.getText();
                password = tampilanlihatpegawai.lpasswordisi.getText();

                tampilanlihatpegawai.btnupdate.setEnabled(true);
                tampilanlihatpegawai.btnhapus.setEnabled(true);

            }
        });

        tampilanlihatservice.tabel.addMouseListener(new MouseAdapter() {
                                                        @Override
                                                        public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = tampilanlihatservice.tabel.getSelectedRow();
                int kolom = tampilanlihatservice.tabel.getSelectedColumn();

                String dataterpilih = tampilanlihatservice.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                tampilanlihatservice.lnama_serviceisi.setText(tampilanlihatservice.tabel.getValueAt(baris, 0).toString());
                tampilanlihatservice.lid_jenisisi.setText(tampilanlihatservice.tabel.getValueAt(baris, 1).toString());
                tampilanlihatservice.lhargaisi.setText(tampilanlihatservice.tabel.getValueAt(baris, 2).toString());

                nama_service = tampilanlihatservice.lnama_serviceisi.getText();
                id_jenis = tampilanlihatservice.lid_jenisisi.getText();
                harga = tampilanlihatservice.lhargaisi.getText();

                tampilanlihatservice.btnupdates.setEnabled(true);
                tampilanlihatservice.btnhapuss.setEnabled(true);

            }
        }
        );

        tampilanlihatpegawai.btnsearch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = tampilanlihatpegawai.tfsearch.getText();
                String data[][] = model.getContactSearch(cari);
                tampilanlihatpegawai.tabel.setModel(new JTable(data, tampilanlihatpegawai.namaKolom).getModel());
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMaxWidth(0);

            }
        });

        tampilanlihatservice.btnsearchs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String cari = tampilanlihatservice.tfsearchs.getText();
                String datas[][] = model.getContactSearchs(cari);
                tampilanlihatservice.tabel.setModel(new JTable(datas, tampilanlihatservice.namaKoloms).getModel());
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMinWidth(0);
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMaxWidth(0);

            }
        });

        tampilanlihatpegawai.btnhapus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String id = tampilanlihatpegawai.lid.getText();
                model.hapusKontak(username);
                String datakontak[][] = model.readContact();
                tampilanlihatpegawai.tabel.setModel((new JTable(datakontak, tampilanlihatpegawai.namaKolom)).getModel());
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                tampilanlihatpegawai.lnamaisi.setText(null);
                tampilanlihatpegawai.lpasswordisi.setText(null);
                tampilanlihatpegawai.lusernameisi.setText(null);
                tampilanlihatpegawai.lid_bagianisi.setText(null);
                tampilanlihatpegawai.tfsearch.setText(null);

            }
        });

        tampilanlihatservice.btnhapuss.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String id = tampilanlihatpegawai.lid.getText();
                model.hapusKontaks(id_jenis);
                String datakontaks[][] = model.readContacts();
                tampilanlihatservice.tabel.setModel((new JTable(datakontaks, tampilanlihatservice.namaKoloms)).getModel());
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMinWidth(0);
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMaxWidth(0);
                tampilanlihatservice.lnama_serviceisi.setText(null);
                tampilanlihatservice.lhargaisi.setText(null);
                tampilanlihatservice.lid_jenisisi.setText(null);
                tampilanlihatservice.tfsearchs.setText(null);

            }
        });

        tampilanlihatpegawai.btnupdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tampilanupdatepegawai.setVisible(true);
                tampilanlihatpegawai.setVisible(false);
                tampilanupdatepegawai.tfnama.setText(nama);
                tampilanupdatepegawai.tfid_bagian.setText(id_bagian);
                tampilanupdatepegawai.tfusername.setText(username);
                tampilanupdatepegawai.tfpassword.setText(password);
            }
        });

        tampilanlihatservice.btnupdates.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tampilanupdateservice.setVisible(true);
                tampilanlihatservice.setVisible(false);
                tampilanupdateservice.tfnama_service.setText(nama_service);
                tampilanupdateservice.tfid_jenis.setText(id_jenis);
                tampilanupdateservice.tfharga.setText(harga);

            }
        });

        tampilanlihatpegawai.btnrefresh.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String contact[][] = model.readContact();

                tampilanlihatpegawai.tabel.setModel(new JTable(contact, tampilanlihatpegawai.namaKolom).getModel());
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                tampilanlihatpegawai.lnamaisi.setText(null);
                tampilanlihatpegawai.lid_bagianisi.setText(null);
                tampilanlihatpegawai.lpasswordisi.setText(null);
                tampilanlihatpegawai.lusernameisi.setText(null);
                tampilanlihatpegawai.btnupdate.setEnabled(false);
                tampilanlihatpegawai.btnhapus.setEnabled(false);
                tampilanlihatpegawai.tfsearch.setText(null);

            }
        });
        tampilanlihatservice.btnrefreshs.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String contacts[][] = model.readContacts();

                tampilanlihatservice.tabel.setModel(new JTable(contacts, tampilanlihatservice.namaKoloms).getModel());
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMinWidth(0);
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMaxWidth(0);
                tampilanlihatservice.lnama_serviceisi.setText(null);
                tampilanlihatservice.lid_jenisisi.setText(null);
                tampilanlihatservice.lpasswordisi.setText(null);
                tampilanlihatservice.lhargaisi.setText(null);
                tampilanlihatservice.btnupdates.setEnabled(false);
                tampilanlihatservice.btnhapuss.setEnabled(false);
                tampilanlihatservice.tfsearchs.setText(null);
            }
        });

        tampilanmain.btnexit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Shutting Down...");
                tampilansebelummain.setVisible(true);
                tampilanmain.dispose();
                tampilancreatepegawai.dispose();
                tampilanlihatpegawai.dispose();
                tampilanupdatepegawai.dispose();

            }
        });

        tampilanmain2.btnexit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Shutting Down...");
                tampilansebelummain.setVisible(true);
                tampilanmain2.dispose();
                tampilancreateservice.dispose();
                tampilanlihatservice.dispose();
                tampilanupdateservice.dispose();

            }
        });

        tampilanupdatepegawai.btnkembali.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanupdatepegawai.setVisible(false);
                tampilanlihatpegawai.setVisible(true);
            }
        });

        tampilanupdateservice.btnkembalis.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanupdateservice.setVisible(false);
                tampilanlihatservice.setVisible(true);
            }
        });

        tampilanupdatepegawai.btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tampilanupdatepegawai.tfnama.getText();
                String id_bagian = tampilanupdatepegawai.tfid_bagian.getText();
                String username = tampilanupdatepegawai.tfusername.getText();
                String password = tampilanupdatepegawai.tfpassword.getText();
                String id = tampilanlihatpegawai.lid.getText();

                model.updateKontak(nama, id_bagian, username, password);
                String contact[][] = model.readContact();
                tampilanlihatpegawai.tabel.setModel(new JTable(contact, tampilanlihatpegawai.namaKolom).getModel());
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                tampilanlihatpegawai.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                tampilanlihatpegawai.lnamaisi.setText(nama);
                tampilanlihatpegawai.lid_bagianisi.setText(id_bagian);
                tampilanlihatpegawai.lusernameisi.setText(username);
                tampilanlihatpegawai.lpasswordisi.setText(password);
                tampilanupdatepegawai.setVisible(false);
                tampilanlihatpegawai.setVisible(true);
            }
        });

        tampilanupdateservice.btnedits.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_service = tampilanupdateservice.tfnama_service.getText();
                String id_jenis = tampilanupdateservice.tfid_jenis.getText();
                String harga = tampilanupdateservice.tfharga.getText();

                model.updateKontaks(nama_service, id_jenis, harga);
                String contacts[][] = model.readContacts();
                tampilanlihatservice.tabel.setModel(new JTable(contacts, tampilanlihatservice.namaKoloms).getModel());
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMinWidth(0);
                tampilanlihatservice.tabel.getColumnModel().getColumn(3).setMaxWidth(0);
                tampilanlihatservice.lid_jenisisi.setText(id_jenis);
                tampilanlihatservice.lnama_serviceisi.setText(nama_service);
                tampilanlihatservice.lhargaisi.setText(harga);
                tampilanupdateservice.setVisible(false);
                tampilanlihatservice.setVisible(true);
            }
        });

    }
}


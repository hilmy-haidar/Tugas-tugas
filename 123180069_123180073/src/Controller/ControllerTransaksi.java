package Controller;

import Model.ModelTransaksi;
import View.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerTransaksi {
    ModelTransaksi modelTransaksi;
    tampilanSebelumMain tampilanSebelumMain;
    View view;
    /*ViewLogin viewLogin;*/
    String dataterpilih = null;
    String dataterpilih1 = null;
    String dataterpilih2 = null;
    int baris,kolom;

    public ControllerTransaksi(ModelTransaksi modelTransaksi, View view){
        this.modelTransaksi = modelTransaksi;
        this.view = view;

        if (modelTransaksi.getBanyakData() != 0) {
            String data[][] = modelTransaksi.readData();
            String data1[][] = modelTransaksi.readService();
            String data2[][] = modelTransaksi.readPegawai();
            view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
            view.tabel1.setModel((new JTable(data1, view.namaKolom1)).getModel());
            view.tabel2.setModel((new JTable(data2, view.namaKolom2)).getModel());

        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        view.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int pilih = view.tabel.getSelectedRow();
                if (pilih == 1) {
                    return;
                }
                String username = (String) view.tabel.getValueAt(pilih, 1);
                view.tfUsername.setText(username);
                String nama_pelanggan = (String) view.tabel.getValueAt(pilih, 2);
                view.tfNama_pelanggan.setText(nama_pelanggan);
                String no_hp = (String) view.tabel.getValueAt(pilih, 3);
                view.tfNo_hp.setText(no_hp);
                String total_biaya = (String) view.tabel.getValueAt(pilih, 4);
                view.tfTotal_biaya.setText(total_biaya);
                super.mousePressed(e);
                baris = view.tabel.getSelectedRow();
                kolom = view.tabel.getSelectedColumn();

                dataterpilih = view.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);

                //int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus NIM" + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (dataterpilih != null) {
                    view.bDelete.setEnabled(true);
                    /* view.bUpdate.setEnabled(true);*/
                }
            }});

        view.tabel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int pilih = view.tabel1.getSelectedRow();
                if (pilih == 1) {
                    return;
                }
                String id_jasa = (String) view.tabel1.getValueAt(pilih, 1);
                view.tfId_jenis.setText(id_jasa);
                String harga = (String) view.tabel1.getValueAt(pilih, 2);
                view.tfTotal_biaya.setText(harga);
                super.mousePressed(e);
                baris = view.tabel1.getSelectedRow();
                kolom = view.tabel1.getSelectedColumn();

                dataterpilih1 = view.tabel1.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih1);

                //int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus NIM" + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

               /* if (dataterpilih != null) {
                    view.bDelete.setEnabled(true);
                     view.bUpdate.setEnabled(true);
                }*/
            }});

        view.tabel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int pilih = view.tabel2.getSelectedRow();
                if (pilih == 1) {
                    return;
                }
                String username = (String) view.tabel2.getValueAt(pilih, 1);
                view.tfUsername.setText(username);
                super.mousePressed(e);
                baris = view.tabel2.getSelectedRow();
                kolom = view.tabel2.getSelectedColumn();

                dataterpilih2 = view.tabel2.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih2);

                //int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus NIM" + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

               /* if (dataterpilih != null) {
                    view.bDelete.setEnabled(true);
                     view.bUpdate.setEnabled(true);
                }*/
            }});

        view.bCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = view.getUsername();
                String id_jenis = view.getId_jenis();
                String nama_pelanggan = view.getNama_pelanggan();
                String no_hp = view.getNo_hp();
                int total_biaya = view.getTotal_biaya();
                modelTransaksi.insertData(username, id_jenis, nama_pelanggan, no_hp, total_biaya);

                String data[][] = modelTransaksi.readData();
                view.tabel.setModel(new JTable(data, view.namaKolom).getModel());
            }
        });

        view.bDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int baris = view.tabel.getSelectedRow();

                if (baris >= 0) {
                    String dataTerpilihX = view.tabel.getValueAt(baris, 0).toString();
                    int dataTerpilih = Integer.parseInt(dataTerpilihX);

                    int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus ID : " + dataTerpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                    if (input == 0) {
                        modelTransaksi.deleteData(dataTerpilih);
                    } else {
                        JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih data yang akan didelete dahulu");
                }
            }
               /* try {
                    if (dataterpilih != null) {
                        model.deleteData(dataterpilih);
                        updateTable();
                        view.bDelete.setEnabled(true);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    System.out.println("Gagal Hapus!");
                }
            }*/
        });

        view.bUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int baris = view.tabel.getSelectedRow();

                if (baris >= 0) {
                    String dataTerpilihX = view.tabel.getValueAt(baris, 1).toString();
                    int dataTerpilih = Integer.parseInt(dataTerpilihX);

                    int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin UPDATE ID : " + dataTerpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                    if (input == 0) {
                        int no_transaksi = view.getno_transaksi();
                        String nama_pelanggan = view.getNama_pelanggan();
                        String no_hp = view.getNo_hp();
                        int total_biaya = view.getTotal_biaya();

                        modelTransaksi.updateData(dataTerpilih, nama_pelanggan, no_hp, total_biaya);
                    } else {
                        JOptionPane.showMessageDialog(null, "Tidak Jadi Diupdate");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih data yang akan diupdate dahulu");
                }
            }
        });

        view.bSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String search = view.tfSearch.getText();
                String datas[][] = modelTransaksi.search(search);
                view.tabel.setModel((new JTable(datas, view.namaKolom)).getModel());
            }
        });

        view.bRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String datas[][] = modelTransaksi.readData();
                view.tfno_transaksi.setText("");
                view.tfNama_pelanggan.setText("");
                view.tfNo_hp.setText("");
                view.tfTotal_biaya.setText("");
                view.tabel.setModel((new JTable(datas, view.namaKolom)).getModel());
            }
        });

        view.bExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null, "Apa anda yakin ingin keluar?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    System.exit(0);
                }
            }
        });
    }




    private void updateTable() {
        String data[][] = modelTransaksi.readData();
        view.tabel.setModel(new JTable(data, view.namaKolom).getModel());
    }
}

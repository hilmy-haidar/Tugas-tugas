import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller {
    String nama,no_hp,umur,email;

    public Controller (Model model, OutputMain outputmain, OutputCreate outputcreate, OutputRead outputread, OutputUpdate outputupdate){
        if (model.getContact()!=0){
            String datacon[][] = model.readContact();
            outputread.table.setModel((new JTable(datacon, outputread.namaKolom)).getModel());
            outputread.table.getColumnModel().getColumn(4).setMinWidth(0);
            outputread.table.getColumnModel().getColumn(4).setMaxWidth(0);
        }
        else {
            int input = JOptionPane.showConfirmDialog(null, "KONTAK BLM ADA, APAKAH ANDA INGIN MEMBUAT ?", "OPSI", JOptionPane.YES_NO_OPTION);

            if (input == 0){
                outputmain.dispose();;
                outputcreate.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "BATAL MEMBUAT KONTAK");
            }
        }

        outputmain.btnCreateKontak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputcreate.setVisible(true);
                outputmain.setVisible(false);
            }
        });

        outputcreate.bTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = outputcreate.tfNama.getText();
                String no_hp = outputcreate.tfNo.getText();
                String umur = outputcreate.tfUmur.getText();
                String email = outputcreate.tfEmail.getText();
                model.insertContact(nama, no_hp, umur, email);

                String contact[][] = model.readContact();
                outputread.table.setModel(new JTable(contact,outputread.namaKolom).getModel());
                outputread.table.getColumnModel().getColumn(4).setMinWidth(0);
               outputread.table.getColumnModel().getColumn(4).setMaxWidth(0);
                outputcreate.setVisible(false);
                outputread.setVisible(true);
                outputcreate.tfNama.setText(null);
                outputcreate.tfNo.setText(null);
               outputcreate.tfUmur.setText(null);
                outputcreate.tfEmail.setText(null);
            }
        });

        outputcreate.bBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               outputcreate.setVisible(false);
                outputmain.setVisible(true);
            }
        });

        outputmain.btnReadKontak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputmain.setVisible(false);
                outputread.setVisible(true);
            }
        });

        outputread.bTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               outputread.setVisible(false);
               outputcreate.setVisible(true);
            }
        });

        outputread.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputread.setVisible(false);
                outputmain.setVisible(true);
            }
        });

        outputread.table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = outputread.table.getSelectedRow();
                int kolom = outputread.table.getSelectedColumn();

                String dataterpilih =  outputread.table.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                outputread.lNamaisi.setText( outputread.table.getValueAt(baris,0).toString());
                outputread.lNoisi.setText( outputread.table.getValueAt(baris,1).toString());
                outputread.lUmurisi.setText( outputread.table.getValueAt(baris,2).toString());
                outputread.lEmailisi.setText( outputread.table.getValueAt(baris,3).toString());
                outputread.lId.setText( outputread.table.getValueAt(baris,4).toString());

                nama =  outputread.lNamaisi.getText();
                no_hp =  outputread.lNoisi.getText();
                umur =  outputread.lUmurisi.getText();
                email = outputread.lEmailisi.getText();

                outputread.bUpdate.setEnabled(true);
                outputread.bHapus.setEnabled(true);
            }
        });

        outputread.bSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cari =  outputread.tfsearch.getText();
                String data[][] = model.getContactSearch(cari);
                outputread.table.setModel(new JTable(data,  outputread.namaKolom).getModel());
                outputread.table.getColumnModel().getColumn(4).setMinWidth(0);
                outputread.table.getColumnModel().getColumn(4).setMaxWidth(0);
            }
        });

        outputread.bHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id =  outputread.lId.getText();
                model.hapusContact(id);
                String datacon[][] = model.readContact();
                outputread.table.setModel((new JTable(datacon,  outputread.namaKolom)).getModel());
                outputread.table.getColumnModel().getColumn(4).setMinWidth(0);
                outputread.table.getColumnModel().getColumn(4).setMaxWidth(0);
                outputread.lNamaisi.setText(null);
                outputread.lNoisi.setText(null);
                outputread.lUmurisi.setText(null);
                outputread.lEmailisi.setText(null);
                outputread.tfsearch.setText(null);
            }
        });

        outputread.bUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputupdate.setVisible(true);
                outputread.setVisible(false);
                outputupdate.tfNama.setText(nama);
                outputupdate.tfNo.setText(no_hp);
                outputupdate.tfUmur.setText(umur);
                outputupdate.tfEmail.setText(email);
            }
        });

        outputread.bRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contact [][] = model.readContact();
                outputread.table.getColumnModel().getColumn(4).setMinWidth(0);
                outputread.table.getColumnModel().getColumn(4).setMaxWidth(0);
                outputread.lNamaisi.setText(null);
                outputread.lNoisi.setText(null);
                outputread.lUmurisi.setText(null);
                outputread.lEmailisi.setText(null);
                outputread.bUpdate.setEnabled(false);
                outputread.bHapus.setEnabled(false);
                outputread.tfsearch.setText(null);
            }
        });

        outputupdate.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputupdate.setVisible(false);
                outputread.setVisible(true);
            }
        });

        outputupdate.bEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = outputupdate.tfNama.getText();
                String no_hp = outputupdate.tfNo.getText();
                String umur = outputupdate.tfUmur.getText();
                String email = outputupdate.tfEmail.getText();
                String id =  outputread.lId.getText();

                model.updateContact(id,nama,no_hp,umur,email);
                String contact [][] = model.readContact();
                outputread.table.setModel(new JTable(contact, outputread.namaKolom).getModel());
                outputread.table.getColumnModel().getColumn(4).setMinWidth(0);
                outputread.table.getColumnModel().getColumn(4).setMaxWidth(0);
                outputread.lNamaisi.setText(nama);
                outputread.lNoisi.setText(no_hp);
                outputread.lUmurisi.setText(umur);
                outputread.lEmailisi.setText(email);
               outputupdate.setVisible(false);
                outputread.setVisible(true);
            }
        });
    }
}


package koneksidatabase;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

import static java.awt.Color.BLUE;
import static java.awt.Color.pink;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewFormEdit extends JFrame{

    JLabel lnama = new JLabel("Nama    :");
    JTextField tfnama = new JTextField();
    JLabel lnim = new JLabel("NIM       :");
    JTextField tfnim = new JTextField();
    JLabel lalamat = new JLabel("Alamat :");
    JTextArea taalamat = new JTextArea();

    JButton btnTambahPanel = new JButton("Edit");
    JButton btnBatalPanel = new JButton("Batal");

    public ViewFormEdit() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(800, 600);
        getContentPane().setBackground(pink);

        JLabel label = new JLabel("FORM EDIT DATA");
        add(label);
        label.setBounds(300, 80, 200, 20);

        add(lnama);
        lnama.setBounds(250, 100, 90, 20);
        add(tfnama);
        tfnama.setBounds(350, 100, 120, 20);
        add(lnim);
        lnim.setBounds(250, 125, 90, 20);
        add(tfnim);
        tfnim.setBounds(350, 125, 120, 20);
        add(lalamat);
        lalamat.setBounds(250, 150, 90, 20);
        add(taalamat);
        taalamat.setBounds(350, 150, 120, 20);

        add(btnTambahPanel);
        btnTambahPanel.setBounds(250, 180, 90, 20);
        btnTambahPanel.setBackground(BLUE);

        add(btnBatalPanel);
        btnBatalPanel.setBounds(370, 180, 90, 20);

    }

    public String getTfnama() {
        return tfnama.getText();
    }

    public String getTfnim() {
        return tfnim.getText();
    }

    public String getTaalamat() {
        return taalamat.getText();
    }


}


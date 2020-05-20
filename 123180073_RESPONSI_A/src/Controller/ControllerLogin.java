package Controller;

//import MVC.MVC;
import Model.DAOLogin;
import Model.ModelLogin;
import View.*;

import MVC.MVC;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerLogin {
    ModelLogin modelLogin;
    ViewLogin viewLogin;
    DAOLogin daoLogin;

    public ControllerLogin(ModelLogin modelLogin, ViewLogin viewLogin, DAOLogin daoLogin) {
        this.modelLogin = modelLogin;
        this.viewLogin = viewLogin;
        this.daoLogin = daoLogin;

        viewLogin.bLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username = viewLogin.getUser();
                String password = viewLogin.getPassword();
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Harap isi semua field");
                } else {
                    modelLogin.setModelLogin(username, password);
                    boolean login = daoLogin.login(modelLogin);
                    if (login) {
                        MVC mvc = new MVC();
                        viewLogin.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Login Berhasil");
                    } else {
                        JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                    }
                }
            }
        });
    }
}

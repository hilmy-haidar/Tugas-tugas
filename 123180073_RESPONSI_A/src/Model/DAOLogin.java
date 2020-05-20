package Model;

import javax.swing.*;
import java.sql.*;

public class DAOLogin {
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;

    public DAOLogin() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/responsipbo";
            koneksi = DriverManager.getConnection(url, "root", "");
            statement = koneksi.createStatement();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class Not found : " + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception : " + ex);
        }
    }

    public boolean login(ModelLogin modelLogin) {
        try {
            String query = "SELECT * FROM login WHERE username = '" + modelLogin.getUsername() + "' " + "AND password = '" + modelLogin.getPassword() + "'";
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                if (modelLogin.getUsername().equals(resultSet.getString("username")) && modelLogin.getPassword().equals(resultSet.getString("password"))) {
                    return true;
                }
            }
            return false;
        } catch (Exception sql) {
            JOptionPane.showMessageDialog(null, sql.getMessage());
            return false;
        }
    }
}

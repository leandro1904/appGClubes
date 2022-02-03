package Exerc8;

import Exerc7.Conexao;
import Exerc7.FPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    private JTextField textFieldUsername;
    private JPasswordField passwField;
    private JButton cancelButton;
    private JButton OKButton;
    private JPanel panelLoginEx8;

    public Login() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtUser = textFieldUsername.getText();
                String txtPass = String.valueOf(passwField.getPassword());

                try {
                    Connection conn = Conexao.CreateConnection();
                    String sql = "SELECT nome, username, password FROM user";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    boolean b = false;
                    while (rs.next()) {
                        String nome = rs.getString(1);
                        String user = rs.getString("username");
                        String pass = rs.getString("password");
                        //System.out.printf("%s - %s - %s", nome, user, pass);
                        //JOptionPane.showMessageDialog(null, nome + ": " + user + "-" + pass);
                        if (txtUser.equals(user) && txtPass.equals(pass)) {
                            new FPrincipal().setVisible(true);
                            b = true;
                        }
                    }
                    if (!b)
                        JOptionPane.showMessageDialog(null,
                                "Erro! Login incorreto! username/password errados!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
                }
            }

        });

    }
}

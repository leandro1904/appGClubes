package Exerc8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FGestaoClubes {
    private JTextField textFieldDesigClube;
    private JButton atribuirJogadoresButton;
    private JTextArea textAreaJogadoresClubes;
    private JTextField textFieldNJogadores;
    private JButton guardarJogadoresButton;
    private JPanel panel1;

    public FGestaoClubes(){

        guardarJogadoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldDesigClube.getText()!="" && textAreaJogadoresClubes.getText()!=""){
                    Clube c = new Clube();
                    c.setDesignacao(textFieldDesigClube.getText());
                    c.setJogadores(FGestaoJogadores.clube);
                    textFieldNJogadores.setText(String.valueOf(FGestaoJogadores.clube.size()));
                }
                else
                    JOptionPane.showMessageDialog(null,"Dados Imcompletos!");
            }
        });
    }

    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Gestão de Clubes");
        frame.setContentPane(new FGestaoClubes().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 420);
        frame.setLocationRelativeTo(null);
        //frame.pack();
        frame.setVisible(true);
    }
}

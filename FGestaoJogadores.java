package Exerc8;

import javax.swing.*;
import java.util.ArrayList;

public class FGestaoJogadores {
    private JTabbedPane tabbedPaneNovo;
    private JPanel panel1;
    private JTextField textFieldNome;
    private JTextField textFieldIdade;
    private JTextField textFieldMorada;
    private JTextField textFieldPeso;
    private JTextField textFieldAltura;
    private JTextField textFieldNCamisa;
    private JTextField textFieldPosiCampo;
    private JTextField textFieldRemuneracao;
    private JButton guardarButton;
    private JButton novoJogadorButton;
    private JButton adicionarButton;
    private JLabel Nome;
    private JTextField textFieldJogadorAPesquisar;
    private JButton pequisarButton;
    private JTextField textFieldAlNome;
    private JTextField textFielAlidade;
    private JTextField textFieldAlPosiCampo;
    private JTextField textFieldAlNumCamisola;
    private JButton alterarButton;
    private JTextArea textAreaJogadoresConsultar;
    private JTextField textFieldJogadorAEliminar;
    private JButton encontrarJogadorButton;
    private JTextField textFieldApNomeJogador;
    private JTextField textFieldApJogadorIdade;
    private JTextField textFieldApJogadorMorada;
    private JButton clubeApósApagarButton;
    private JTextArea textAreaClubeApagar;

    public String Designacao;
    public static ArrayList<Jogador> clube;

    public static int nJ = 0;

    public void setVisible(boolean b) {
        JFrame frame = new JFrame("Gestão de Jogadores");
        frame.setContentPane(new FGestaoJogadores().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 420);
        frame.setLocationRelativeTo(null);
        //frame.pack();
        frame.setVisible(true);
    }


}



package Exerc8;

import Exerc7.FGestaoAlunos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class FGestaoJogadoresClube {


    private JButton buttonJogadores;
    private JButton clubesButton;

    public FGestaoJogadoresClube() {
        buttonJogadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FGestaoJogadores().setVisible(true);
            }
        });
        clubesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FGestaoClubes().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestão de Jogadores e Clubes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


package Exerc8;

import java.util.ArrayList;

public class Clube {

        public String Designacao;
        public ArrayList<Jogador> Jogadores;

        public Clube () {}

        public Clube(String design, ArrayList<Jogador> jogadores) {
            this.Designacao=design;
            this.Jogadores=(ArrayList<Jogador>) jogadores.clone();
        }

        public void setJogadores(ArrayList<Jogador> jogadores) {
            this.Jogadores = (ArrayList<Jogador>) jogadores.clone();
        }

        public void setDesignacao(String designacao) { this.Designacao = designacao; }

        public String getDesignacao() { return this.Designacao;}

        public ArrayList<Jogador> getJogadores() { return this.Jogadores; }
    }




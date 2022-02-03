package Exerc8;

public class Jogador {
    public String Nome;
    public int Idade;
    public String Morada;
    public double Peso;
    public double Altura;
    public int NumCamisa;
    public int PosiCampo;
    public int Remuneracao;

    public Jogador() {}

    public Jogador(String nome, int idade, String morada, double peso, double altura, int numcamisa, int posicampo, int remuneracao){
        this.Nome=nome;
        this.Idade=idade;
        this.Morada=morada;
        this.Peso=peso;
        this.Altura=altura;
        this.NumCamisa=numcamisa;
        this.PosiCampo=posicampo;
        this.Remuneracao=remuneracao;
    }

    public void setNome(String nome) { this.Nome = nome;  }
    public void setIdade(int idade) { this.Idade = idade;  }
    public void setMorada(String morada) {this.Morada=morada;}
    public void setAltura(double altura) {this.Altura=altura;}
    public void setPeso(double peso) { this.Peso = peso;  }
    public void setNumCamisa(int numCamisa) { this.NumCamisa = numCamisa; }
    public void setPosiCampo(int posiCampo) { this.PosiCampo = posiCampo; }
    public void setRemuneracao(int remuneracao) { this.Remuneracao = remuneracao;   }

    public String getNome() { return this.Nome;  }
    public int getIdade() { return this.Idade; }
    public String getMorada() { return this.Morada;}
    public double getAltura() { return this.Altura;}
    public double getPeso() {return this.Peso;   }
    public int getNumCamisa() {return this.NumCamisa;}
    public int getPosiCampo() {return this.PosiCampo;}
    public int getRemuneracao() { return Remuneracao;  }

    public double TotalSalario(){
        return(this.Remuneracao*14);
    }
    public double IMC() {
        return (this.Peso/this.Altura*Altura);
    }

}

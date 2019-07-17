package br.com.jogo.personagens;

import br.com.jogo.armas.Arma_IF;

public abstract class Personagem {

    String nome;
    Arma_IF arma;

    public abstract void desenhar();

    public abstract void falar();

    public abstract void correr();

    public abstract void voar();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void setArma(Arma_IF a) {
        this.arma = a;
    }

    public void usarArma() {
        this.arma.atirar();
    }
}

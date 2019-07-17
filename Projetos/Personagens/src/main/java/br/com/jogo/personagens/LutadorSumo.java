package br.com.jogo.personagens;

public class LutadorSumo extends Personagem {

    @Override
    public void desenhar() {
        System.out.println("Lutador de Sumo desenhado!");
    }

    @Override
    public void falar() {
        System.out.println("Lutador de Sumo falando!");
    }

    @Override
    public void correr() {
        System.out.println("Lutador de Sumo andando!");
    }

    @Override
    public void voar() {
        System.out.println("Lutador de Sumo nao voa!");
    }
}

package br.com.jogo.personagens;

public class Soldado extends Personagem {

    @Override
    public void desenhar() {
        System.out.println("Soldado desenhado!");
    }

    @Override
    public void falar() {
        System.out.println("Soldado falando!");
    }

    @Override
    public void correr() {
        System.out.println("Soldado correndo!");
    }

    @Override
    public void voar() {
        System.out.println("Soldado nao voa!");
    }
}

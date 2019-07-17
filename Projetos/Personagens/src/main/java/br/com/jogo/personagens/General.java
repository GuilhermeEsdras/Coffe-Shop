package br.com.jogo.personagens;

public class General extends Personagem {

    @Override
    public void desenhar() {
        System.out.println("General desenhado!");
    }

    @Override
    public void falar() {
        System.out.println("General falando!");
    }

    @Override
    public void correr() {
        System.out.println("General correndo!");
    }

    @Override
    public void voar() {
        System.out.println("General nao voa!");
    }

}

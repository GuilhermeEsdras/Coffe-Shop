package br.com.jogo.personagens;

public class DragaoAlado extends Personagem {
    @Override
    public void desenhar() {
        System.out.println("Dragao desenhado");
    }

    @Override
    public void falar() {
        System.out.println("Ruge!");
    }

    @Override
    public void correr() {
        System.out.println("Dragao nao corre!");
    }

    @Override
    public void voar() {
        System.out.println("Dragao voa!");
    }

    @Override
    public void usarArma() {
        System.out.println("Cospe fogo!");
    }
}

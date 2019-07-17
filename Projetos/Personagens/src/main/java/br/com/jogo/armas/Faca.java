package br.com.jogo.armas;

public class Faca implements Arma_IF {
    @Override
    public void atirar() {
        System.out.println("Corta!");
    }
}

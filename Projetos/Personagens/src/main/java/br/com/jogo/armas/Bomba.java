package br.com.jogo.armas;

public class Bomba implements Arma_IF {
    @Override
    public void atirar() {
        System.out.println("Explode!");
    }
}

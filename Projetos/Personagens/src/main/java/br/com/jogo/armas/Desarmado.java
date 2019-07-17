package br.com.jogo.armas;

public class Desarmado implements Arma_IF {
    @Override
    public void atirar() {
        System.out.println("Desarmado!");
    }
}

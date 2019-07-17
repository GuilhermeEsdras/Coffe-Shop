package br.com.jogo.armas;

public class Revolver implements Arma_IF {
    @Override
    public void atirar() {
        System.out.println("Tiro!");
    }
}

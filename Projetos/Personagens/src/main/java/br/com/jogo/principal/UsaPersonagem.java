package br.com.jogo.principal;

import br.com.jogo.armas.*;
import br.com.jogo.personagens.*;

public class UsaPersonagem
{
    public static void main( String[] args )
    {
        Personagem p;

        p = new Soldado();
        p.desenhar();
        p.falar();
        p.correr();
        p.voar();
        p.setArma( new Revolver() );
        p.usarArma();
        p.setArma( new Faca());
        p.usarArma();

        p = new General();
        p.falar();
        p.setArma( new Fuzil() );
        p.usarArma();
        p.setArma( new Bomba() );
        p.usarArma();

        p = new LutadorSumo();
        p.falar();
        p.setArma( new Desarmado() );
        p.usarArma();

        p = new DragaoAlado();
        p.desenhar();
        p.falar();
        p.correr();
        p.voar();
        p.usarArma();
    }
}

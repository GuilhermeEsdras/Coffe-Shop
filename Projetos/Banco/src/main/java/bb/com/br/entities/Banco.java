package bb.com.br.entities;

import java.util.LinkedList;
import java.util.List;

public class Banco {

    private List<Conta> listaContas = null;

    public Banco() {
        listaContas = new LinkedList<>();
    }


    public boolean cadastrarConta( int numero, String titular, double saldoInicial ) {

        for( Conta c : listaContas )
            if( c.getNumero() == numero )
                return false;

        Conta temp = new Conta( numero, titular, saldoInicial );
        return listaContas.add( temp );

    }

    public int quantidadeContas() {
        return listaContas.size();
    }

    public String buscarConta( int numero ) {

        for( Conta c : listaContas )
            if( c.getNumero() == numero )
                return c.toString();

        return "Conta nao encontrada";
    }
}

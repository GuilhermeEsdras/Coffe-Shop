package bb.com.br.principal;

import bb.com.br.entities.Banco;
import bb.com.br.entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.print("Numero: ");
        int numero = input.nextInt();
        System.out.print("Titular: ");
        input.nextLine();
        String titular = input.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = input.nextDouble();

        int quantContas = banco.quantidadeContas();
        System.out.println("Quant contas: " + quantContas);

        System.out.print("Numero da conta a buscar: ");
        int num = input.nextInt();
        System.out.println(banco.buscarConta(num));

        /*
        while (true) {
            System.out.print( "Projeto Banco\n" +
                                "===================\n" +
                                "   [1] - Criar uma conta\n" +
                                "   [2] - Depositar" +
                                "   [3] - Sacar" +
                                "   [4] - Extrato" +
                                "   [5] - Verificar saldo" +
                                "   [6] - Sair" +
                                "       Digite uma opcao:_");
        }
        */

        input.close();
    }
}

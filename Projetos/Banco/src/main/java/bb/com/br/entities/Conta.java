package bb.com.br.entities;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;


    public Conta() {
        setNumero(0);
        setTitular("Sem nome.");
    }

    public Conta(int numero, String titular, double saldoInicial) {
        setNumero(numero);
        setTitular(titular);
        setSaldo(saldoInicial);
    }


    public void sacar(double quantia) {
        if( quantia > 0 && quantia <= this.saldo) this.saldo -= quantia;
    }

    public void depositar(double quantia) {
        if( quantia > 0) this.saldo += quantia;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero >= 0) this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular != null && titular.length() > 0) this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return  "Dados da Conta - " +
                "Numero: " + numero +
                ", Titular: '" + titular + '\'' +
                ", Saldo: R$ " + saldo;
    }
}

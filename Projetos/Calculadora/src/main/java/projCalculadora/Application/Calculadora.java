package projCalculadora.Application;

public class Calculadora
{
    private String descricao;
    private double memoria;

    public Calculadora() {
        alterarDescricao("Sobre padrao.");
    }

    public double somar(double umNumero, double outroNumero) {
        return umNumero + outroNumero;
    }

    public double subtrair(double umNumero, double outroNumero) {
        return umNumero - outroNumero;
    }

    public double multiplicar(double umNumero, double outroNumero) {
        return umNumero * outroNumero;
    }

    public double dividir(double umNumero, double outroNumero) {
        if (outroNumero != 0) {
            return umNumero / outroNumero;
        }
        else return 0;
    }

    public void gravarMemoria(double umResultado) {
        this.memoria = umResultado;
    }

    public double lerMemoria() {
        return this.memoria;
    }

    public void alterarDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String consultarDescricao() {
        return this.descricao;
    }
}
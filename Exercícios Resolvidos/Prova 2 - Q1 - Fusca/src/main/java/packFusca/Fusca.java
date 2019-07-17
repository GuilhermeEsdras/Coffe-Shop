package packFusca;

public class Fusca implements Comparable<Fusca> {

    private String cor;
    private double preco;


    public Fusca(String c, double p) {
        setCor(c);
        setPreco(p);
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Fusca{" +
                "cor='" + cor + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Fusca o) {
        return getCor().compareTo(o.getCor());
    }
}

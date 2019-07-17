package packMusicas;

import java.util.Objects;

public class Musica implements Comparable<Musica> {

    private int codigo;
    private String titulo;
    private String artista;
    private int ano;


    public Musica(int cod, String tit, String art, int ano) {
        setCodigo(cod);
        setTitulo(tit);
        setArtista(art);
        setAno(ano);
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString() {
        return  getCodigo() + ";" +
                getTitulo() + "\t;" +
                getArtista() + "\t;" +
                getAno() + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return getCodigo() == musica.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }


    @Override
    public int compareTo(Musica o) {
        return ( getTitulo().compareTo(o.getTitulo()) );
    }
}

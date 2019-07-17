package cities;

import java.util.Objects;

public class City implements Comparable<City> {

    private String nome;
    private String sigla;
    private Integer zipCode;


    City(String nome, String sigla, Integer zipCode) {
        setNome(nome);
        setSigla(sigla);
        setZipCode(zipCode);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return nome + ", " + sigla + ", " + zipCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return getNome().equals(city.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }


    @Override
    public int compareTo(City o) {
        return nome.compareTo(o.getNome());
    }
}

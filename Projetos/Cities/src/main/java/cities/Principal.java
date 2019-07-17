package cities;

import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Set;

public class Principal
{

    public static void main(String[] args ) {

        CitiesProcessor cp = new CitiesProcessor();

        Set<City> set = cp.buildSetOfCities("C:\\Users\\Guilherme\\Java\\Cities\\src\\main\\java\\cities\\cities_duplicatas.txt");
        cp.setCitiesSet( set );

        // Organiza por nome, usando o compareTo "original" da classe City;
        // Elimina todas as cidades que possuem o mesmo nome;
        // Depois salva em um arquivo chamado cities_natural.txt;
        cp.writeSetOfCities(Paths.get("cities_natural.txt"), set, Comparator.naturalOrder());

        // Organiza por ZipCode, usando o compareTo override da interface ComparatorByZipCode
        // Elimina todas as cidades que possuem o mesmo Zip;
        // Depois salva em um arquivo chamado cities_zip.txt;
        ComparatorByZipCode comparadorZip = new ComparatorByZipCode();
        cp.writeSetOfCities(Paths.get("cities_zip.txt"), set, comparadorZip);

        // Organiza por sigla/estado, usando o compareTo override da interface ComparatorByState
        // Elimina todas as cidades que possuem o mesmo estado/sigla;
        // Depois salva em um arquivo chamado cities_state.txt;
        ComparatorByState comparadorState = new ComparatorByState();
        cp.writeSetOfCities(Paths.get("cities_state.txt"), set, comparadorState);

    }
}

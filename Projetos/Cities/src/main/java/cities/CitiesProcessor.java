package cities;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class CitiesProcessor {

    private Set<City> citiesSet;

    void setCitiesSet(Set<City> citiesSet) {
        this.citiesSet = citiesSet;
    }


    Set<City> buildSetOfCities(String path) {

        Path filePath = Paths.get(path);

        Set<City> citiesSet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(String.valueOf(filePath))) ) {

            String line = br.readLine();

            while (line != null) {
                String[] campo = line.split(", ");

                String name = campo[0];
                String sigla = campo[1];
                Integer zip = Integer.parseInt(campo[2]);

                citiesSet.add(new City(name, sigla, zip));

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return citiesSet;
    }

    void writeSetOfCities(Path pathDestino, Set<City> set, Comparator<City> comparator) {

        TreeSet<City> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(set);

        try (FileWriter writer = new FileWriter(String.valueOf(pathDestino));
             BufferedWriter bufferedWriter = new BufferedWriter(writer)){

            for(City city : treeSet) {
                bufferedWriter.write(city.toString() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }


}

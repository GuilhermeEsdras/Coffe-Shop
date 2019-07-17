package packMusicas;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class GerenciadorMusicas {

    private Set<Musica> musicaSet;

    public void setMusicaSet(Set<Musica> musicaSet) {
        this.musicaSet = musicaSet;
    }

    public Set<Musica> getMusicaSet() {
        return musicaSet;
    }


    public Set<Musica> lerTodasAsMusicas(Path pathOrigem ) {

        Set<Musica> newMusicaSet = new HashSet<>();

        try ( BufferedReader br = new BufferedReader( new FileReader(String.valueOf(pathOrigem) ) ) ) {


            String dadosDaMusica = br.readLine();
            System.out.println("Arquivo" + pathOrigem.toAbsolutePath() + " recebido com sucesso!");

            while (dadosDaMusica != null) {

                String[] campo = dadosDaMusica.split(";");

                int codigo = Integer.parseInt(campo[0]);
                String titulo = campo[1];
                String artista = campo[2];
                int ano = Integer.parseInt(campo[3]);

                newMusicaSet.add( new Musica(codigo, titulo, artista, ano) );

                dadosDaMusica = br.readLine();

            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Leitura finalizada. Novo set criado!");

        return newMusicaSet;
    }

    public boolean removerMusica( int cod, Path pathDestino ) {

        Set<Musica> musicaSet = getMusicaSet();
        boolean sucesso = false;

        System.out.println("Escaneando txt em busca da musica de codigo: " + cod);
        for( Musica musica : musicaSet ) {
            if( musica.getCodigo() == cod ) {
                sucesso = true;
            }
        }

        if(sucesso) {

            System.out.println("Musica encontrada!");

            System.out.println("Tentando escrever novo txt em: " + pathDestino.toAbsolutePath() );
            try (FileWriter fileWriter = new FileWriter(String.valueOf(pathDestino));
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                for(Musica musica : musicaSet) {
                    if(!(musica.getCodigo() == cod))
                        bufferedWriter.write(musica.toString());
                }

            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage() );
            }

            return sucesso;
        }

        else {
            System.out.println("Nao foi encontrada musica com este codigo!");
            return sucesso;
        }
    }

    public boolean editarDadosMusica( int cod, String novoTitulo, int novoAno, Path pathDestino ) {

        Set<Musica> musicaSet = getMusicaSet();
        boolean sucesso = false;


        System.out.println("Escaneando txt em busca da musica de codigo: " + cod);
        for( Musica musica : musicaSet ) {
            if( musica.getCodigo() == cod ) {
                musica.setTitulo(novoTitulo);
                musica.setAno(novoAno);
                System.out.println("Musica editada com sucesso!");
                System.out.println("Novos dados:");
                System.out.println(musica);
                sucesso = true;
            }
        }

        if(sucesso) {

            System.out.println("Tentando escrever novo txt em: " + pathDestino.toAbsolutePath() );
            try (FileWriter fileWriter = new FileWriter(String.valueOf(pathDestino));
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                for(Musica musica : musicaSet) {
                    bufferedWriter.write(musica.toString());
                }

            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage() );
            }

            return sucesso;
        }

        else {
            System.out.println("Nao foi encontrada musica com este codigo!");
            return sucesso;
        }

    }

    public void gravarMusicasOrdenadasPor(Path pathDestino, Comparator<Musica> comparator ) {

        TreeSet<Musica> musicaTreeSet = new TreeSet<>(comparator);
        musicaTreeSet.addAll(getMusicaSet());

        try (FileWriter fileWriter = new FileWriter(String.valueOf(pathDestino));
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            System.out.println("Escrevendo novo txt para: " + pathDestino.toAbsolutePath() );

            for(Musica musica : musicaTreeSet) {
                bufferedWriter.write(musica.toString());
            }


        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage() );
        }

    }

    /*
    public Map<Integer, List<Musica>> agruparMusicasPorAno() {

        Map<Integer, List<Musica>> MusicasMap = new TreeMap<>();
        Set<Musica> musicaSet = getMusicaSet();
        String titulo;

        for(Musica musica : musicaSet ) {
            titulo = musica.getTitulo();
            if( MusicasMap.containsKey( musica.getAno() ) ) {
                MusicasMap.put(musica.getAno(), );
            }
            MusicasMap.put(musica.getAno(), )
        }

    }


    public void gravarMapaMusicas( Path pathDestino ) {

    }
    */

}

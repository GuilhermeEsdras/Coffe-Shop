package packMusicas;

import java.nio.file.Paths;
import java.util.*;

public class GerenciadorDemo {

    public static void main( String[] args ) {

        System.out.println("Inicio de programa!");

        Scanner input = new Scanner(System.in);

        GerenciadorMusicas gm = new GerenciadorMusicas();

        Set<Musica> musicaSet = gm.lerTodasAsMusicas(Paths.get("C:\\Users\\ifpb\\projeto-musicas\\src\\main\\java\\packMusicas\\50-worst-songs.txt"));
        gm.setMusicaSet(musicaSet);


        ComparaPorAno comparaPorAno = new ComparaPorAno();
        gm.gravarMusicasOrdenadasPor(Paths.get("Musicas_por_ano.txt"), comparaPorAno);

        ComparaPorArtista comparaPorArtista = new ComparaPorArtista();
        gm.gravarMusicasOrdenadasPor(Paths.get("Musicas_por_artista.txt"), comparaPorArtista);

        ComparaPorTitulo comparaPorTitulo = new ComparaPorTitulo();
        gm.gravarMusicasOrdenadasPor(Paths.get("Musicas_por_titulo.txt"), comparaPorTitulo);

        ComparaPorCodigo comparaPorCodigo = new ComparaPorCodigo();
        gm.gravarMusicasOrdenadasPor(Paths.get("Musicas_por_codigo.txt"), comparaPorCodigo);


        gm.editarDadosMusica(1005, " editada editada editada", 2019, Paths.get("Musicas_com_dados_alterados.txt") );

        gm.removerMusica(1005, Paths.get("Musicas_sem_cod_1005.txt") );

        Map<Integer, List<Musica>> MusicasMap = new TreeMap<>();


        /*
        System.out.print("Digite o codigo da musica a ser removida do txt: ");
        int cod = input.nextInt();
        gm.removerMusica(cod, Paths.get("Musicas_sem_cod_1005.txt"));

        System.out.print("Digite o codigo da musica a ser editada do txt: ");
        cod = input.nextInt();
        System.out.println("Agora digite os novos dados: ");
        input.nextLine();
        System.out.print("Titulo: ");
        String titulo = input.nextLine();
        System.out.println("Ano: ");
        int ano = input.nextInt();
        gm.editarDadosMusica(cod, titulo, ano, Paths.get("Musicas_com_dados_alterados.txt"));
        */


        input.close();
        System.out.println( "Programa finalizado! \n" +
                            "(Aguarde enquanto os arquivos estao sendo salvos no sistema!)");

    }

}

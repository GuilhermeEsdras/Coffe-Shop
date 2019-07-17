package packMusicas;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.Set;

public class GerenciadorMusicasTest
{

    @Test
    public void removerMusica() {

        GerenciadorMusicas gm = new GerenciadorMusicas();

        Set<Musica> musicaSet = gm.lerTodasAsMusicas(Paths.get("C:\\Users\\ifpb\\projeto-musicas\\src\\main\\java\\packMusicas\\50-worst-songs.txt"));
        gm.setMusicaSet(musicaSet);

        gm.removerMusica(1005, Paths.get("Musicas_sem_cod_1005.txt") );

        /*
        Assert.assertArrayEquals();
        */

    }
}

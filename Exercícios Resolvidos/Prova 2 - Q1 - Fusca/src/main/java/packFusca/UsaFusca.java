package packFusca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsaFusca {
    public static void main( String[] args ) {

        List<Fusca> lf = Arrays.asList(
                new Fusca("azul escuro", 2500),
                new Fusca("Azul claro", 1900),
                new Fusca("azul marinho", 1920)
        );

        Collections.sort(lf, Collections.<Fusca>reverseOrder());

        for (Fusca f : lf) System.out.println(f);
    }

}

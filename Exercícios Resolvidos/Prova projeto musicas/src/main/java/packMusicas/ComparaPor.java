package packMusicas;

import java.util.Comparator;

public abstract class ComparaPor implements Comparator<Musica> {
    public abstract int compare(Musica m1, Musica m2);
}

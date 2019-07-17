package packMusicas;

public class ComparaPorAno extends ComparaPor {
    @Override
    public int compare(Musica m1, Musica m2) {
        return ( m1.getAno() - m2.getAno() );
    }
}

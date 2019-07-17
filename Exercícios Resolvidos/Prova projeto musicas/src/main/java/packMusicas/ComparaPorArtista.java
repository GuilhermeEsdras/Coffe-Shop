package packMusicas;

public class ComparaPorArtista extends ComparaPor {
    @Override
    public int compare(Musica m1, Musica m2) {
        return ( m1.getArtista().compareTo(m2.getArtista()) );
    }
}

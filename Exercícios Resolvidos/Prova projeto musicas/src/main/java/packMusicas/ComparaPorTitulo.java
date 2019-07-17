package packMusicas;

public class ComparaPorTitulo extends ComparaPor {
    @Override
    public int compare(Musica m1, Musica m2) {
        return ( m1.getTitulo().compareTo(m2.getTitulo()) );
    }
}

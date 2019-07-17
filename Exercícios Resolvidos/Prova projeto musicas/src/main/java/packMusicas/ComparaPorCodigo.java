package packMusicas;

public class ComparaPorCodigo extends ComparaPor {
    @Override
    public int compare(Musica m1, Musica m2) {
        return ( m1.getCodigo() - m2.getCodigo() );
    }
}

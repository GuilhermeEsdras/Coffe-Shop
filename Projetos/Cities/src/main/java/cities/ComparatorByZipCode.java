package cities;

public class ComparatorByZipCode extends ComparatorBy {
    @Override
    public int compare(City o1, City o2) {
        return ( o1.getZipCode() - o2.getZipCode() );
    }
}

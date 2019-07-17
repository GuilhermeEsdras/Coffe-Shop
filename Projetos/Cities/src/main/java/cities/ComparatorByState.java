package cities;

public class ComparatorByState extends ComparatorBy {
    @Override
    public int compare(City o1, City o2) {
        return ( o1.getSigla().compareTo(o2.getSigla()) );
    }
}

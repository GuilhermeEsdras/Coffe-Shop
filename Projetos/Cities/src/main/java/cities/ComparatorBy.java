package cities;

import java.util.Comparator;

public abstract class ComparatorBy implements Comparator<City> {
    public abstract int compare(City o1, City o2);
}

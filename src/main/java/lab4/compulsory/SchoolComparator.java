package lab4.compulsory;

import java.util.Comparator;


public class SchoolComparator implements Comparator<School> {
/**
 * The SchoolComparator class has the implementation of the compare method,
 * making use of the overwritten compareTo function in the School class
 **/
    @Override
    public int compare(School o1, School o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

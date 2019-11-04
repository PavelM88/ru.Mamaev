package task22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        String p1 = a.getName();
        String p2 = b.getName();
        int sCompare = p1.compareTo(p2);
        if (sCompare != 0){
            return sCompare;
        } else {
            Integer i1 = a.getAge();
            Integer i2 = b.getAge();
            return i1.compareTo(i2);
        }
    }
}

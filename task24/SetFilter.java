package task24;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetFilter {
    public static void main(String[] args) {
        LinkedHashSet<String> setList = new LinkedHashSet<>();
        setList.add("foo");
        setList.add("buzz");
        setList.add("bar");
        setList.add("fork");
        setList.add("bort");
        setList.add("spoon");
        setList.add("!");
        setList.add("dude");
        System.out.println(setList);
        removeEvenLength(setList);

    }
    private static   Set<String> removeEvenLength(Set<String> set){
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            String s = iterator.next();
            if (s.length() % 2 == 0) {
                iterator.remove();
            }
        }
        for (String s: set) {
            System.out.print(s + " ");
        }
        return set;
    }
}

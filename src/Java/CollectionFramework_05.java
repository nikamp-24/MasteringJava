package Java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFramework_05 {
    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();  // elements are stored in random order
//        Set<Integer> set = new LinkedHashSet<>(); // elements are stored in order they come

        Set<Integer> set = new TreeSet<>();  // the elements are stored in sorted order
        set.add(12);
        set.add(22);
        set.add(92);
        set.add(42);

        System.out.println(set);

        set.remove(32);
        System.out.println(set);

        System.out.println(set.contains(42));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}

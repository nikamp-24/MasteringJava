package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionFramework_08 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(8);

        System.out.println("Minimum Element:"+Collections.min(list));
        System.out.println("Maximum Element:"+Collections.max(list));
        System.out.println(Collections.frequency(list, 1));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}

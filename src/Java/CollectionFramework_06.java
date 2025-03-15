package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionFramework_06 {
    public static void main(String[] args) {
//        Map<String, Integer> numbers = new HashMap<>();

        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);

        System.out.println(numbers);

        numbers.remove("Three");

//        if (!numbers.containsKey("Two")){
//            numbers.put("Two", 2);
//        }

        numbers.putIfAbsent("Two", 2);
        System.out.println(numbers.containsValue(3));

        System.out.println(numbers.isEmpty());
//        System.out.println(numbers);
//
//        for (Map.Entry<String, Integer> e: numbers.entrySet()){
//            System.out.println(e);
//
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        for (String key : numbers.keySet()){
//            System.out.println(key);
//        }
//
//        for (Integer value: numbers.values()){
//            System.out.println(value);
//        }

    }
}
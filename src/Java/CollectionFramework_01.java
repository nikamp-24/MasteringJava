package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionFramework_01 {
    public static void main(String[] args) {

//        Arraylist extends the List
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);



//   Methods of the arraylist class
//        Add element at the end of the list
        list.add(4);
        System.out.println(list);

//        Add element at a given index in a list
        list.add(1, 50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

//        Add whole list to another list
        list.addAll(newList);
        System.out.println(list);

//        get the element at the particular index
        System.out.println(list.get(3));


//        set the element at a given index in a list by replacing existing element
        list.set(1, 10000);
        System.out.println(list);


//        to check whether the element is present in a list or not
        System.out.println(list.contains(10000));


//        get the elements of list  using for loop
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println("The element is " + list.get(i));
        }


        for (Integer element : list) {
            System.out.println("Foreach element is " + element);
        }

//        printing the elements using iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator element is " + it.next());
        }

        // Removes the element at the index
        list.remove(2);
        System.out.println(list);


//        Deletes the content of the list and returns empty list
        list.clear();
        System.out.println(list);



        //     we can use all the functions of ArrayList for the LinkList also because it also implements the list interface
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
    }
}

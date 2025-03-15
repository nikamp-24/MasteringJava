package Java;


import java.util.Stack;

public class CollectionFramework_02 {
    public static void main(String[] args) {

        Stack <String> animals = new Stack<>();
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Donkey");
// prints the stack
        System.out.println("Animals:"+animals);

//        Gives the top element of the stack
        System.out.println(animals.peek());

//        removes the top element of the stack
        animals.pop();

        System.out.println(animals);


    }
}

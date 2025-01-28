package Home.Java_basics;

public class basic_58 {
    public static void main(String[] args) {
        int[] array = {10, -20, 0, 30, 40, 60, 10};

        boolean result = (array[0] == 10 || array[array.length - 1] == 10);
        System.out.println(result);
    }
}

package Home.Java_methods;

public class method_09 {
    public static void main(String[] args) {
        print_Chars('(', 'z');
    }

    public static void print_Chars(char start, char end) {

        int count = 0;

        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
            count++;

            if (count % 20 == 0) {
                System.out.println();
            }
        }
    }
}

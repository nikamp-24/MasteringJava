package Home.Java_methods;

public class method_07 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {

            System.out.printf("%-6d", getPentagonalNumber(i));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int i) {

        return (i * (3 * i - 1)) / 2;
    }
}

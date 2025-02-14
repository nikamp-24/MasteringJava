package Home.Java_basics;

import java.util.Arrays;

public class basic_73 {
    public static void main(String[] args) {
        int[] num = {10, 10, 30, 40, 60};
        int odd = 0;
        int even = 0;

        System.out.println("Original Array: " + Arrays.toString(num));

        boolean found1010 = false;
        boolean found2020 = false;

        for (int i = 0; i < num.length - 1 ; i++){
            if (num[i] == 10 && num[i + 1] == 10){
                found1010 = true;
            }else if (num[i] == 20 && num[i + 1] == 20){
                found2020 = true;
            }
        }
        System.out.printf(String.valueOf(found1010 != found2020));
        System.out.println("\n");
    }
}

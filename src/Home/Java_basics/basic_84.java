package Home.Java_basics;

public class basic_84 {
    public static void main(String[] args) {
//        determine whether the number 10 in a given array of integers exceeds 20.

        int[] arr = {20, 45, 64, 64, 10, 54, 10};

        int ctr1 = 0 ;
        int ctr2 = 0 ;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 10) ctr1++;
            if (arr[i] == 20) ctr2++;
        }

        System.out.println(String.valueOf(ctr1 > ctr2));
    }
}

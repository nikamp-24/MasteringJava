package Home.Java_basics;

public class basic_77 {
    public static boolean has10Before20(int[] arr) {
        boolean found10 = false;

        for (int num : arr){
            if (num == 10){
             found10 = true;
            }
            if (found10 && num == 20){
                return true;
            }
        }

        return false ;


    }
    public static void main(String[] args) {
   int[] arr1 = {1, 56, 89, 67, 67, 89};
   int[] arr2 = {1, 10, 56, 89, 67, 67, 20, 89};
   int[] arr3 = {1, 56, 10, 89, 67, 67, 89};
   int[] arr4 = {1, 56, 89, 10, 67, 20, 67, 89};

        System.out.println(has10Before20(arr1));
        System.out.println(has10Before20(arr2));
        System.out.println(has10Before20(arr3));
        System.out.println(has10Before20(arr4));
    }
}

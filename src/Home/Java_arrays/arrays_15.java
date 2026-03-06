package Home.Java_arrays;

public class arrays_15 {
    public static void main(String[] args) {
        int arr[]  = {1, 2, 3, 4, 5 , 7};

       for (int j = 0; j<arr.length; j++){
           for (int i = 1; i<=arr.length; i++){
             if ( arr[j] != i){
                 System.out.println(false);
             }
           }
       }
    }
}

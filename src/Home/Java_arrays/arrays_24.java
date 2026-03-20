package Home.Java_arrays;

public class arrays_24 {
    public static void main(String[] args) {
        int [] arr = {1,2 ,3 , 4, 5, 6, 6, 4};
        int pairSum = 5;


        for (int i = 0; i< arr.length-1; i++){
            int op1 = arr[i];
            int sum  = op1 + arr[i+1];

            if (sum == pairSum){
                System.out.println(op1+","+arr[i+1]);
            }
        }
    }
}

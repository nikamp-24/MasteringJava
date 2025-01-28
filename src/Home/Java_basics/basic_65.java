package Home.Java_basics;

public class basic_65 {
    public static void main(String[] args) {
int[] arr1 = {1, 3, -5, 4} ;
int[] arr2 = {1, 4, -5, -2} ;

for (int i = 0; i <= arr1.length -1 ; i++){
    int num1 = arr1[i];
    int num2 = arr2[i];
    System.out.print(Integer.toString(num1 * num2) + " ");
}

    }
}

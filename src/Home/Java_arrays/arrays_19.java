package Home.Java_arrays;

public class arrays_19 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        int maxDiff = arr[1] - arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - min > maxDiff) {
                maxDiff = arr[i] - min;
            }

            if (min<arr[i]){
                min = arr[0];
            }
        }

        System.out.println(maxDiff);
    }
}

package Home.Java_arrays;

public class arrays_06 {

//    Count how many times each element appears in the array
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 1, 4, 8};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Number of times each element appears:");

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " appears " + count + " time(s)");
        }
    }
}

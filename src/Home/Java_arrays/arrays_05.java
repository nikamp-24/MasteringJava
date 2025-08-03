package Home.Java_arrays;

public class arrays_05 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 7, 1, 4, 8};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    visited[j] = true;
                }
            }
        }
    }
}

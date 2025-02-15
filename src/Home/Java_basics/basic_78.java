package Home.Java_basics;

public class basic_78 {

    public static boolean numberPattern(int[] nums, int target){
        for (int i = 0; i < nums.length ; i++){

            if (nums[i] == target && nums[i+1] == target){
                return true;
            }
            if (i < nums.length - 2 && nums[i] == target && nums[i + 2] == target){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 7, 2, 8};
        int[] arr2 = {5, 1, 5, 9, 3};
        int[] arr3 = {4, 2, 6, 4, 5};
        int[] arr4 = {1, 2, 3, 4, 5};


        System.out.println(numberPattern(arr1, 7));
        System.out.println(numberPattern(arr2, 5));
        System.out.println(numberPattern(arr3, 4));
        System.out.println(numberPattern(arr4, 7));
    }
}

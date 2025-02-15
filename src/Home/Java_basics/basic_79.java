package Home.Java_basics;

public class basic_79 {
    public static boolean appearsThirce(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 20) {
                count++;

                if (i > 0 && nums[i - 1] == 20) {
                    return false;
                }
            }
        }

        return count == 3;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 20, 5, 20, 6, 20, 7};
        int[] nums2 = {20, 10, 20, 20, 5, 6};
        int[] nums3 = {10, 20, 30, 20, 40};


        System.out.println(appearsThirce(nums1));
        System.out.println(appearsThirce(nums2));
        System.out.println(appearsThirce(nums3));
    }
}

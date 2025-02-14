package Home.Java_basics;

public class basic_72 {
    public static void main(String[] args) {
//        Count Even and Odd in given array

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8} ;

        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("\\nNumber of even elements in the array: " + even);
        System.out.println("\\nNumber of odd elements in the array: " + odd);
    }
}

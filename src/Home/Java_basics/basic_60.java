package Home.Java_basics;

import java.util.Arrays;

public class basic_60 {
    public static void main(String[] args) {

//        check if array of length 2 is having 4 or 7
        int[] ori_arr = {5, 7};

        System.out.println(Arrays.toString(ori_arr));

        if (ori_arr[0] == 4 || ori_arr[0] == 7){
            System.out.println(true);
        }else if (ori_arr[1] == 4 || ori_arr[1] == 7){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}

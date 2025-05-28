package Home.Java_data_types;

public class data_types_11 {
    public static void main(String[] args) {
        // Define two integers: one minimum, one maximum
        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MAX_VALUE;

        System.out.println("Signed integers: " + in1 + ", " + in2);

        int compare_Signed_num = Integer.compare(in1, in2);
        System.out.println("Result of comparing signed numbers: " + compare_Signed_num);

        int compare_Unsigned_num = Integer.compareUnsigned(in1, in2);
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_num);
    }
}

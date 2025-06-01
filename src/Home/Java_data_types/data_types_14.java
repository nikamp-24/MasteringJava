package Home.Java_data_types;

public class data_types_14 {
    public static void main(String[] args) {
        float floatNum = 0.2f;
        System.out.println("Initial float number: "+floatNum);

        float floatNextDown = Math.nextDown(floatNum);
        float floatNextUp = Math.nextUp(floatNum);

        System.out.println("Next down (float) from" + floatNum + ": "+floatNextDown);
        System.out.println("Next up (float) from"+floatNum + ": " +floatNextUp);

        System.out.println("Float POSITIVE_INFINITY next down: "+ Math.nextDown(Float.POSITIVE_INFINITY));
        System.out.println("Float NEGTIVE_INFINITY next up :" + Math.nextUp(Float.NEGATIVE_INFINITY));

        double doubleNum = 0.2;
        System.out.println("\nInitial double number: " + doubleNum);

        double doubleNextDown = Math.nextDown(doubleNum);
        double doubleNextUp = Math.nextUp(doubleNum);

        System.out.println("Next down (double) from " + doubleNum + ": " + doubleNextDown);
        System.out.println("Next up   (double) from " + doubleNum + ": " + doubleNextUp);


        System.out.println("\nDouble POSITIVE_INFINITY next down: " + Math.nextDown(Double.POSITIVE_INFINITY));
        System.out.println("Double NEGATIVE_INFINITY next up  : " + Math.nextUp(Double.NEGATIVE_INFINITY));
    }
}

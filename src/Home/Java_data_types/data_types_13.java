package Home.Java_data_types;

import java.math.BigInteger;

public class data_types_13 {
    public static void main(String[] args) {
//        Java program that extracts and displays all primitive data type values (byte, short, int, long, float, double, boolean, char) from a given BigInteger.
//        Additionally, the question explains how BigInteger objects can be constructed from a signum and magnitude byte array.
        BigInteger bigInt = new BigInteger("123456789");

        // Extracting primitive types
        byte byteVal = bigInt.byteValue();
        short shortVal = bigInt.shortValue();
        int intVal = bigInt.intValue();
        long longVal = bigInt.longValue();
        float floatVal = bigInt.floatValue();
        double doubleVal = bigInt.doubleValue();

        // Interpreting BigInteger as boolean (non-zero = true)
        boolean boolVal = !bigInt.equals(BigInteger.ZERO);

        // Interpreting BigInteger as char (casting to int first)
        char charVal = (char) bigInt.intValue();

        // Output
        System.out.println("BigInteger: " + bigInt);
        System.out.println("byte value   : " + byteVal);
        System.out.println("short value  : " + shortVal);
        System.out.println("int value    : " + intVal);
        System.out.println("long value   : " + longVal);
        System.out.println("float value  : " + floatVal);
        System.out.println("double value : " + doubleVal);
        System.out.println("boolean value: " + boolVal);
        System.out.println("char value   : '" + charVal + "' (Unicode code: " + (int)charVal + ")");
    }
}

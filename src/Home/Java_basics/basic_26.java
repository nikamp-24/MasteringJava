package Home.Java_basics;

import kotlin.text.Charsets;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class basic_26 {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();


        System.out.println("List of available character sets:");
        for (String charsetName : charsets.keySet()) {
            System.out.println(charsetName);
        }

    }
}

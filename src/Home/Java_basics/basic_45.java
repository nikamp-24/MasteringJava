package Home.Java_basics;

import java.util.Scanner;


public class basic_45 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Input a Sentence: ");
                String sentence = scanner.nextLine();


                String capitalizedSentence = capitalizeWords(sentence);

                // Display the result
                System.out.println(capitalizedSentence);

                scanner.close();
            }


            public static String capitalizeWords(String sentence) {

                String[] words = sentence.split("\\s+");
                StringBuilder capitalizedSentence = new StringBuilder();


                for (String word : words) {


                    if (word.length() > 0) {
                        capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                                .append(word.substring(1).toLowerCase())
                                .append(" ");
                    }
                }

                return capitalizedSentence.toString().trim();
            }
        }

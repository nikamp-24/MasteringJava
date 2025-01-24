import java.util.Scanner;

public class basic_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = sc.nextLine().toCharArray();

        int letter = 0 ;
        int digit = 0 ;
        int spaceBar = 0 ;
        int other = 0 ;

        for (int i = 0 ; i < letters.length ; i++){
           if (Character.isLetter(letters[i])){
               letter++;
            } else if (Character.isDigit(letters[i])) {
               digit++;
           } else if (Character.isSpaceChar(letters[i])) {
               spaceBar++;
           }
           else {
               other++;
           }
        }

        System.out.println("letter: " + letter);
        System.out.println("space: " + spaceBar);
        System.out.println("number: " + digit);
        System.out.println("other: " + other);

    }
}

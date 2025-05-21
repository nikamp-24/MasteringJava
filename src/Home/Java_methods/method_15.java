package Home.Java_methods;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class method_15 {
//   method to display the current date and time
    public static void main(String[] args) {
        showDateTime();
    }
    public static void showDateTime(){
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MM dd , yyyy hh:mm:ss");


    }
}

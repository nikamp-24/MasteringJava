package Home.Java_basics;

import java.io.File;
public class basic_31 {
    public static void main(String[] args) {
        String[] filePaths = {
                "/home/students/abc.txt",
                "/home/students/test.txt"
        };


        for (String filePath : filePaths) {
            File file = new File(filePath);

            // Check if the file exists
            if (file.exists()) {

                long fileSize = file.length();
                System.out.println(filePath + " : " + fileSize + " bytes");
            } else {
                System.out.println(filePath + " : File does not exist");
            }
        }
    }
}

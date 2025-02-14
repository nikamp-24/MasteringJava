package Home.Java_basics;


//import static java.lang.System.getSecurityManager;

public class basic_70 {
    public static void main(String[] args) {
// get system environment and system properties

        System.out.println("Current System Environment: ");
        System.out.println(System.getenv());

        System.out.println("Current System Properties: ");
        System.out.println(System.getProperties());

//        check whether System security manager is installed on device
//        it is depricated and no longer in use due to modern security modela
//        System.out.println("System security interface:");
//        System.out.println(getSecurityManager());

//        Environment variables
//         Display the value of the specified environment variable "PATH"
        System.out.println("Environment variable PATH: ");
        System.out.println(System.getenv("PATH"));


// Display the value of the specified environment variable "TEMP"
        System.out.println("Environment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));


//         Display the value of the specified environment variable "USERNAME"
        System.out.println("Environment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
}

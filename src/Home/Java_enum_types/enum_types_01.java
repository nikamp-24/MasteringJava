package Home.Java_enum_types;

public class enum_types_01 {

    public enum DaysOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY

    }

    public static void main(String[] args) {
        System.out.println("Days of the Week:");
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day);
        }
    }
}

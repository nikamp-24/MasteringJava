package Home.Java_enum_types;

public class enum_types_04 {
    public enum Direction{
        SOUTH,
        NORTH,
        EAST,
        WEST
    }
    public static void main(String[] args) {
        System.out.println("The directions are : ");
        for (Direction direction : Direction.values()){
            System.out.println(direction);
        }
    }
}

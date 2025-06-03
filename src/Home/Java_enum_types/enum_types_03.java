package Home.Java_enum_types;

public class enum_types_03 {
    public enum Shape{
        CIRCLE(0),
        TRIANGLE(3),
        SQUARE(4),
        RECTANGLE(4),
        PENTAGON(5),
        HEXAGON(6);

        private final int sides;


        Shape(int sides){
            this.sides = sides;
        }

        public int getSides() {
            return sides;
        }
    }
    public static void main(String[] args) {
        System.out.println("Shapes and their number of sides:");
        for (Shape shape : Shape.values()) {
            System.out.println(shape + " has " + shape.getSides() + " sides.");
        }
    }
}

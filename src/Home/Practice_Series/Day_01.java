package Home.Practice_Series;

public class Day_01 {
   static class Student{
        int id ;
        String name;
        Student(int id, String name){
            this.id = id;
            this.name = name;
        }

       @Override
       public boolean equals(Object obj) {
           if (this == obj) return true;
           if (obj == null || getClass() != obj.getClass()) return false;
           Student student = (Student) obj;
           return id == student.id && name.equals(student.name);
       }
    }
    public static void main(String[] args) {
        Student obj = new Student(1, "Pooja");
        Student obj1 = new Student(1, "Pooja");

        System.out.println(obj==obj1);
        System.out.println(obj.equals(obj1));

    }
}

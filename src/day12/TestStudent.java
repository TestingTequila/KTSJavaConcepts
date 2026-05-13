package day12;

public class TestStudent
{
    public static void main(String[] args) {

       Students student1 = new Students();
       int marks =student1.displayStudentsMarks("Mohit");
        System.out.println("Marks in Maths: " + marks);
    }
}

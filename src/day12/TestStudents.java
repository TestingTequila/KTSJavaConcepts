package day12;

public class TestStudents
{
    public static void main(String[] args) {
        Student stud= new Student();
        int marks =stud.displayStudentsMarks("Bharati");
        System.out.println("Maths: " + marks);
    }
}

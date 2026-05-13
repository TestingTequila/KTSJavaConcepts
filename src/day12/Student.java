package day12;

public class Student
{
    public int displayStudentsMarks(String studentName)
    {
        System.out.println("Displaying Marks for the student: " + studentName);

        int marks = -1;

        if(studentName.equals("Ashish"))
        {
            marks= 78;
        }
        else if (studentName.equals("Bharati"))
        {
            marks= 84;
        }
        else if (studentName.equals("Ram"))
        {
            marks= 56;
        }
        else if (studentName.equals("Daisy"))
        {
            marks= 96;
        }
        else if (studentName.equals("Kerrie"))
        {
            marks= 100;
        }
        else if (studentName.equals("Ben"))
        {
            marks= 66;
        }
        else if (studentName.equals("Lee"))
        {
            marks= 34;
        }
        return marks;
    }
}

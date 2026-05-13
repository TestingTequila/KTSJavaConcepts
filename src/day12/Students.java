package day12;

public class Students
{
    public int displayStudentsMarks(String studentName)
    {
        System.out.println("Displaying Marks for the student: " + studentName);

        if(studentName.equals("Ashish"))
        {
            return 78;
        }
        else if (studentName.equals("Bharati"))
        {
            return 84;
        }
        else if (studentName.equals("Ram"))
        {
            return 56;
        }
        else if (studentName.equals("Daisy"))
        {
            return 96;
        }
        else if (studentName.equals("Kerrie"))
        {
            return 100;
        }
        else if (studentName.equals("Ben"))
        {
            return 66;
        }
        else if (studentName.equals("Lee"))
        {
            return 34;
        }
        return -1;
    }
}

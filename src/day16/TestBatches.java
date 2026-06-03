package day16;

public class TestBatches
{
    public static void main(String[] args) {

       Batches b1= new Batches();
       b1.numberOfStudents =10;
       b1.averageAge =21;
       b1.city = "Delhi";
       b1.isGraduate = false;

        System.out.println(b1.numberOfStudents);
        System.out.println(b1.averageAge);
        System.out.println(b1.city);
        System.out.println(b1.isGraduate);
        System.out.println(Batches.trainersName);

        System.out.println("=====================================");

        Batches b2= new Batches();
        b2.numberOfStudents =30;
        b2.averageAge =32;
        b2.city = "NJ";
        b2.isGraduate = true;

        System.out.println(b2.numberOfStudents);
        System.out.println(b2.averageAge);
        System.out.println(b2.city);
        System.out.println(b2.isGraduate);
        System.out.println(Batches.trainersName);

    }
}

package day9;

public class TestEmployee
{
    public static void main(String[] args) {


        Employee e1 = new Employee();

        //System.out.println(e1.fName +", "+ e1.lName + ", " + e1.age +", " + e1.city+ ", $" +e1.salary);

        e1.fName = "Tom";
        e1.lName = "Hanks";
        e1.age =50;
        e1.city = "NJ";
        e1.salary = 10000;

        System.out.println(e1.fName +", "+ e1.lName + ", " + e1.age +", " + e1.city+ ", $" +e1.salary);


       Employee e2 = new Employee();
       e2.fName = "Kerrie";
       e2.lName = "Wright";
       e2.age = 28;
       e2.city = "NY";
       e2.salary = 7000;

       System.out.println(e2.fName +", "+ e2.lName + ", " + e2.age +", " + e2.city+ ", $" +e2.salary);


       Employee e3 = new Employee();
       e3.fName = "Mohit";
       e3.lName = "Tewari";
       e3.age =24;
       e3.city = "Pune";
       e3.salary = 20000;

        System.out.println(e3.fName +", "+ e3.lName + ", " + e3.age +", " + e3.city+ ", Rs." +e2.salary);

        e3= null; //NPE

        //System.out.println(e3.fName +", "+ e3.lName + ", " + e3.age +", " + e3.city+ ", Rs." +e2.salary);

        // No Reference Object - should be avoided

        new Employee().fName = "Bharati";
        new Employee().lName = "Mishra";
        new Employee().age =32;

        System.out.println("===========================================================");

        Company comp1= new Company();
        comp1.companyName = "Microsfot";
        comp1.empCount =20000;
        comp1.isPrivate = true;

        System.out.println(comp1.companyName + ", " + comp1.empCount + ", " + comp1.isPrivate);

        System.gc();


    }
}

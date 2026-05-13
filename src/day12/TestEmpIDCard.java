package day12;

public class TestEmpIDCard
{
    public static void main(String[] args) {

        EmpIDCard emp1= new EmpIDCard();
        String empName =emp1.fullName("Ashish", "Mishra");
        String empCardName=empName + " Medma";
        System.out.println("Name on Emp Card is: " + empCardName);


        EmpIDCard emp2= new EmpIDCard();
        String empName2=emp2.fullName("Bharati", "Mishra");
        String empCardName2= empName2 + " Medma";
        System.out.println("Name on Emp Card is: " + empCardName2);
    }
}

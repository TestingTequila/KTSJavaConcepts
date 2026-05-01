package day8;

public class TestResume {
    public static void main(String[] args) {


        Resume emp1 = new Resume();
        emp1.firstName = "Jason";
        emp1.lastName = "Roger";
        emp1.gender = 'M';
        emp1.age = 34;
        emp1.designation = "QA Lead";

        System.out.println(emp1.firstName+ ", " + emp1.lastName + ", "+ emp1.gender + ", " + emp1.age + ", " +emp1.designation);

        Resume emp2 = new Resume();
        emp2.firstName = "Kerrie";
        emp2.lastName = "Wright";
        emp2.gender = 'F';
        emp2.age =27;
        emp2.designation = "QA";
        System.out.println(emp2.firstName+ ", " + emp2.lastName + ", "+ emp2.gender + ", " + emp2.age + ", " +emp2.designation);

        Resume emp3 = new Resume();
        emp3.firstName = "Lee";
        emp3.lastName = "Wilson";
        emp3.gender = 'M';
        emp3.age=42;
        emp3.designation = "Director";
        System.out.println(emp3.firstName+ ", " + emp3.lastName + ", "+ emp3.gender + ", " + emp3.age + ", " +emp3.designation);

    }
}

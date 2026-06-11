package day19;

public class Employee {
    private String fName;
    private String lName;
    private int age;
    private int salary;

    //to set their values;
    public void setfName(String fName) {

        if(fName.equals("Justin"))
        {
            this.fName = "N/A";
        }
        else {
            this.fName = fName;
        }
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        if (salary > 1000 & salary <= 10000)
        {
            this.salary = salary;
        }
        else
        {
            this.salary = 0;
        }
    }

    //to get their value;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}

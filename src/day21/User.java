package day21;

public class User
{
    private String name;
    private int age;
    private String city;

    public User(String name, String city) {
        this(name, 44);
        this.name = name;
        this.city = city;
    }

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public User(int age, String city) {
        this.age = age;
        this.city = city;
    }

    public User(String name, int age) {
        this(name, age, "New York");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

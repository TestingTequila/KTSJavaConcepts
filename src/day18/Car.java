package day18;

public class Car
{
    String name;
    String color;
    int price;
    boolean isAutomatic;

    public  Car(String name, String color, int price, boolean isAutomatic)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    public  Car(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public  Car(String name, String color, int price)
    {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public  Car(String color, int price, boolean isAutomatic)
    {

        this.color = color;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }


    public  Car(int price, boolean isAutomatic)
    {
        this.price = price;
        this.isAutomatic = isAutomatic;
    }


}

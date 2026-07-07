package day26;

public interface Society
{
    String employee="Ashish";
    public  void buildingName();// abstract methods cannot be static, because then they cannot be overridden

    public static void calculateResidentsNumber()
    {

    };

    default void clubHouseAccess()
    {

    }


}

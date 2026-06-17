package day22;

public class CBR
{
    private  int a;
    private  int b;

    //constructor to set the value of private variable a & b
    public CBR(int b, int a) {
        this.b = b;
        this.a = a;
    }

    //to get the value of private variable a
    public int getA() {
        return a;
    }

    //to get the value of private variable b
    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public  void updateValue(CBR obj)
    {
        obj.setA(400);
        obj.setB(1200);
    }
}

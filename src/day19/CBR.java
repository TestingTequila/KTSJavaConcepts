package day19;

public class CBR {
    private int a;
    private int b;

    public CBR(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void updateValue(CBR cbr)
    {
        cbr.a = 100;
        cbr.b =500;
    }
}

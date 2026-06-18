package day23.Abstraction;

public class B extends Base {

    @Override
    public void addition(int a, int b) {
        System.out.println("Addition by B: " + (2 * a + b));
    }
}

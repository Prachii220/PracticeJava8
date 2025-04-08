package InterfaceExamples;

public class InterfaceImpl implements  draw, Print {


    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public void draw() {
        System.out.println("Im' drawing");

    }
}

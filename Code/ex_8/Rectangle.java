package ex_8;

public class Rectangle extends Shape {
    private int length;
    private int width;
    @Override
    public double getArea() {
        int S = length * width;
        return S;
    }
}

package ex_8;

public class Triangle extends Shape {
    private int base;
    private int height;
    @Override
    public double getArea() {
        double S = 0.5*base*height;
        return S;
    }
}

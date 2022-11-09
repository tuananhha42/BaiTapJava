package ex_7;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double S = (3.14 * radius) * (3.14 * radius);
        return S;
    }



    @Override
    public double getArea() {
        double P = 2 * 3.14 * radius;
        return P;
    }
}

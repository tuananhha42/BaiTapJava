package ex_8;

public abstract class Shape {
    private String color;
    public abstract double getArea();
    public String toString() {
        return "color: " + color;
    }
}

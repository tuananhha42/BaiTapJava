package ex_7;

public class ResizableCircle extends Circle implements Resizeable  {
    public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public void resize(int percent) {
        this.radius += percent;
    }

}

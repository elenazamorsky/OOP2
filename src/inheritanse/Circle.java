package inheritanse;

public class Circle extends Shape {

    private Point a;
    private  Point b;
    private final double pi = Math.PI;

    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Circle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                '}'/'n';
    }

    @Override
    public double getPerimeter() {
        return 2* distance(a, b) * pi;
    }

    @Override
    public double getArea() {
        return pi * (distance(a, b)* distance(a, b));
    }
}

package inheritanse;

import javafx.print.Printer;

public class Triangle extends Shape {

    private Point a;
    private  Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}'/'n'
        ;
    }

    @Override
    public double getPerimeter() {

        return distance(a, b) + distance(b, c) + distance(c, a) ;
    }

    @Override
    public double getArea() {
        double pPerimeter = getPerimeter()/2;
        return Math.sqrt(pPerimeter*(pPerimeter-distance(a, b))*(pPerimeter-distance(b, c))*(pPerimeter -distance(c, a)));
    }
}

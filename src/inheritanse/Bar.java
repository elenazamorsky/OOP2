package inheritanse;

public class Bar extends Shape {
    private Point a;
    private  Point b;
    private Point c;
    private Point d;

    public Bar(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Bar() {
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}'/'n';
    }

    @Override
    public double getPerimeter() {

        return distance(a, b) + distance(b, c)+ distance(c, d) + distance(d, a);
    }

    @Override
    public double getArea() {
        double pPerimeter = getPerimeter()/2;
        return Math.sqrt((pPerimeter-distance(a, b))*(pPerimeter-distance(b, c))*(pPerimeter* distance(c, d))-(pPerimeter- distance(d, a)));
    }
}

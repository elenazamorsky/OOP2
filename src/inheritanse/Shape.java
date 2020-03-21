package inheritanse;

import javafx.print.Printer;

public abstract class Shape {

    protected double distance(Point point, Point point2) {

        return Math.sqrt((point2.getX() - point.getX()) * (point2.getX() - point.getX()) + ((point2.getY() - point.getY()) * (point2.getY() - point.getY())));

    }

    public abstract double getPerimeter();

    public abstract double getArea();
}

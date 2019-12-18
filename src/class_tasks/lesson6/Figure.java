package class_tasks.lesson6;

import class_tasks.lesson6.interfaces.Drawable;
import class_tasks.lesson6.interfaces.Printable;

public abstract class Figure implements Printable, Drawable {
    private Point center;
    protected static final double PI = 3.14;

    public Figure(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }
    abstract String getFigureType();
    abstract double getSquare();
    abstract double getPerimeter();
    abstract boolean containsPoint(Point point);

    @Override
    public void printInformation() {

    }
}

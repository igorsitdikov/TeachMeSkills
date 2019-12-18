package class_tasks.lesson6;

public class Circle extends Figure {
    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    String getFigureType() {
        return "Circle";
    }

    @Override
    double getSquare() {
        return PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    boolean containsPoint(Point point) {
        double y = (point.getY() - getCenter().getY()) * (point.getY() - getCenter().getY());
        double x = (point.getX() - getCenter().getX()) * (point.getX() - getCenter().getX());

        return x + y <= radius * radius;
    }

    @Override
    public void printInformation() {
        System.out.println("Circle  with center in " + getCenter().getX() + " " + getCenter().getY() + " and radius " + radius);
    }

    @Override
    public void draw() {

    }
}

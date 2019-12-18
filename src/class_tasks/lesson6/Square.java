package class_tasks.lesson6;

public class Square extends Rectangle {
    public Square(Point center, int side) {
        super(center, side, side);
    }

    @Override
    String getFigureType() {
        return "Square";
    }

    @Override
    public void printInformation() {
        System.out.println("Square with center in " + getCenter().getX() + " " + getCenter().getY() + " " + " with width " + getWidth() + " and height " + getHeight());

    }

}

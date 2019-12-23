package class_tasks.lesson6;

public class Rectangle extends Figure {
    private int width;
    private int height;
    private double left;
    private double right;
    private double top;
    private double bottom;

    public Rectangle(Point center, int width, int height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    @Override
    String getFigureType() {
        return "Rectangle";
    }

    @Override
    double getSquare() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    boolean containsPoint(Point point) {
        left = getCenter().getX() - (double) width / 2;
        right = getCenter().getX() + (double) width / 2;
        top = getCenter().getY() + (double) height / 2;
        bottom = getCenter().getY() - (double) height / 2;

        return point.getY() <= top && point.getY() >= bottom && point.getX() <= right && point.getX() >= left;
    }

    @Override
    public void printInformation() {
        System.out.println("Rectangle with center in " + getCenter().getX() + " " + getCenter().getY() + " " + " with width " + width + " and height " + height);
    }

    @Override
    public void draw() {
        int side = 100;
        int realTop = (int) (side / 2 - top);
        int realBottom = (int) (side / 2 - bottom);
        int realLeft = (int) (side / 2 + left);
        int realRight = (int) (side / 2 + right);
        for (int i = 0; i <= side; i++) {
            for (int j = 0; j <= side; j++) {
                if (i == side / 2 - getCenter().getY() && j == side / 2 + getCenter().getX()) {
                    System.out.print("*");
                } else if ((j == realLeft || j == realRight)
                        && i >= realTop
                        && i <= realBottom) {
                    System.out.print("|");
                } else if ((i == realTop || i == realBottom) && j >= realLeft && j <= realRight) {
                    System.out.print("-");
                } else if (i == side / 2) {
                    System.out.print("-");
                } else if (j == side / 2) {
                    System.out.print("|");
                } else if (j == side / 2 && i == side / 2) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j <= height; j++) {
                if (i == width || i == 0) {
                    if (j == 0 || j == height) {
                        System.out.print("|");
                    } else {
                        System.out.print("-");
                    }
                } else {
                    if (j == 0 || j == height) {
                        System.out.print("|");
                    } else {
                        if (getCenter().getX() == i && getCenter().getY() == j) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

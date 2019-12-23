package class_tasks.lesson6;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(0,0);
        Point point1 = new Point(2,3);
        point1.draw();
        point.printInformation();
        System.out.println(point.getX() + " "  + point.getY());
        point.draw();
        Circle circle = new Circle(point, 4);
        circle.printInformation();
        System.out.println("Circle square " + circle.getSquare());
        System.out.println("Circle perimeter " + circle.getPerimeter());
        System.out.println("Contains " + circle.containsPoint(point1));

        Point point2 = new Point(-22,-14);
        Rectangle rectangle = new Rectangle(point2, 14, 14);
        System.out.println(rectangle.getFigureType());
        rectangle.printInformation();
        System.out.println("height "+rectangle.getHeight());
        System.out.println("width "+rectangle.getWidth());
        System.out.println("contains " + rectangle.containsPoint(point1));
        rectangle.draw();

        Point point3 = new Point(-22,-14);
        Square square = new Square(point3, 4);
        System.out.println(square.getFigureType());
        square.printInformation();
        System.out.println("height "+square.getHeight());
        System.out.println("width "+square.getWidth());
        System.out.println("contains " + square.containsPoint(point1));
        square.draw();
    }
}

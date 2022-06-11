package HW8;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        Oval oval = new Oval();

        ShapeService shapeService = new ShapeService(circle);
        System.out.println(shapeService.name());

        ShapeService shapeService2 = new ShapeService(triangle);
        System.out.println(shapeService2.name());
    }
}

package factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Shape shape1 = factory.getInstance("rectangle");
        Shape shape2 = factory.getInstance("square");
        Shape shape3 = factory.getInstance("circle");

        System.out.println("----------------------");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}

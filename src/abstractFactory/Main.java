package abstractFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        AbstractFactory abstractFactory1 = factory.getFactory(false);
        Shape shape1 = abstractFactory1.getInstance("rectangle");
        shape1.draw();

        Shape shape2 = abstractFactory1.getInstance("square");
        shape2.draw();

        System.out.println("----------------------");

        AbstractFactory abstractFactory2 = factory.getFactory(true);
        Shape shape3 = abstractFactory1.getInstance("rectangle");
        shape3.draw();

        Shape shape4 = abstractFactory1.getInstance("square");
        shape4.draw();
    }
}

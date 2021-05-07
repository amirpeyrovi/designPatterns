package abstractFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ShapeFactory extends AbstractFactory {
    public ShapeFactory() {
        System.out.println("shape factory create");
    }

    @Override
    public Shape getInstance(String type) {
        Shape shape;

        switch (type){
            case "square":
                shape = new Square();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
            default:
                throw new NotImplementedException();
        }

        return shape;
    }
}

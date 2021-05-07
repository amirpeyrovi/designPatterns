package abstractFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RoundedShapeFactory extends AbstractFactory {
    public RoundedShapeFactory() {
        System.out.println("rounded shape factory create");
    }

    @Override
    public Shape getInstance(String type) {
        Shape shape;

        switch (type){
            case "square":
                shape = new RoundedSquare();
                break;
            case "rectangle":
                shape = new RoundedRectangle();
                break;
            default:
                throw new NotImplementedException();
        }

        return shape;
    }
}

package abstractFactory;

public class Factory {
    public AbstractFactory getFactory(boolean rounded){
        if (rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }

    }
}

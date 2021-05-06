package factory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Factory {
    public Shape getInstance(String type){
        Shape shape;

        switch (type.toLowerCase()){
            case "rectangle":
                shape = new Rectangle();
                break;
            case "square":
                shape = new Square();
                break;
            case "circle":
                shape = new Circle();
                break;
            default:
                throw new NotImplementedException();
        }

        return shape;
    }
}

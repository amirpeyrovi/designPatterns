package singleton;

public class Main {
    public static void main(String[] args) {

        SingleObject object1 = SingleObject.getInstance();
        object1.showMassage("object1");

        System.out.println("----------------------");

        SingleObject object2 = SingleObject.getInstance();
        object2.showMassage("object2");

        System.out.println("----------------------");

        SingleObject object3 = SingleObject.getInstance();
        object3.showMassage("object3");

    }
}

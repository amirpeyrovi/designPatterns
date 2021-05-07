package singleton;

public class SingleObject {
//    private static final SingleObject instance = new SingleObject();
    private static SingleObject instance;

    private SingleObject() {
        System.out.println("single object create");
    }

    public static SingleObject getInstance() {
        if (instance == null) {
            synchronized (SingleObject.class){
                if(instance == null) {
                    instance = new SingleObject();
                }
            }
        }
        return instance;
    }

    public void showMassage(String name) {
        System.out.println("show message: " + name);
    }
}

//public class SingleObject {
//    private static final SingleObject instance = new SingleObject();
//
//    private SingleObject() {
//        System.out.println("single object create");
//    }
//
//    public static SingleObject getInstance() {
//        return instance;
//    }
//
//    public void showMassage(String name) {
//        System.out.println("show message: " + name);
//    }
//}

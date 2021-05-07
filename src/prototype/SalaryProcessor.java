package prototype;

import java.util.Random;

public class SalaryProcessor implements Cloneable{

    private String formula;
    private String personName;
    private Float salary = 0f;

    public SalaryProcessor() {
        // load all settings
        System.out.println("Initializing salary processor for ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        formula = "Loaded formula";
        System.out.println("salary processor initialized");
    }

    public SalaryProcessor(String personName) {
        // load all settings
        System.out.println("Initializing salary processor for " + personName + " ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        formula = "Loaded formula";
        this.personName = personName;
        System.out.println("salary processor initialized");
    }

    public void calculate() {
        salary = new Random().nextFloat();
    }

    public SalaryProcessor setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    @Override
    public String toString() {
        return "SalaryProcessor{" +
                "personName='" + personName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

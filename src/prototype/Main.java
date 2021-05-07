package prototype;

public class Main {
    public static void main(String[] args) {
        SalaryProcessor processor1 = SalaryProcessorCache.getProcessor();
        processor1.setPersonName("Person1");
        processor1.calculate();

        System.out.println("----------------------");

        SalaryProcessor processor2 = SalaryProcessorCache.getProcessor();
        processor2.setPersonName("Person2");
        processor2.calculate();

        System.out.println("----------------------");

        SalaryProcessor processor3 = SalaryProcessorCache.getProcessor();
        processor3.setPersonName("Person3");
        processor3.calculate();

        System.out.println("----------------------");

        System.out.println(processor1);
        System.out.println(processor2);
        System.out.println(processor3);
    }
}

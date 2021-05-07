package prototype;

public class SalaryProcessorCache {
    private static SalaryProcessor processor;
    static {
        processor = new SalaryProcessor();
    }

    public static SalaryProcessor getProcessor(){
        System.out.println("return salary processor");
        return (SalaryProcessor) processor.clone();
    }
}

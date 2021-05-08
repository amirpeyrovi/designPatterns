package adapter;

public class CapitalIntelligentStockDataReader implements IntelligentStockDataReader {
    @Override
    public JsonData read() {
        return new JsonData("Capital market Intelligent data (JSON)");
    }
}

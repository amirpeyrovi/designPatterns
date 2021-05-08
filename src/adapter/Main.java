package adapter;

public class Main {
    public static void main(String[] args) {

        StockDataProvider stockDataProvider1 = new StockDataProvider(new CommonMarketDataReader());

        System.out.println(stockDataProvider1.read("Capital"));
        System.out.println(stockDataProvider1.read("Money"));

        System.out.println("----------------------");

        StockDataProvider stockDataProvider2 = new StockDataProvider(new IntelligentStockDataReaderAdapter());
        System.out.println(stockDataProvider2.read("Capital"));
        System.out.println(stockDataProvider2.read("Money"));

    }
}

package adapter;

public class CommonMarketDataReader implements StockDataReader {
    @Override
    public XmlData readData(String market) {

        if (market.compareToIgnoreCase("money") == 0) {
            return new XmlData("Money market common data (XML)");
        }else if (market.compareToIgnoreCase("capital") == 0) {
            return new XmlData("Capital market common data (XML)");
        }else{
            System.out.println("Error: Market not found");
            return null;
        }
    }
}

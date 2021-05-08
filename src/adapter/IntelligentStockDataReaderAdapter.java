package adapter;

public class IntelligentStockDataReaderAdapter implements StockDataReader {

    private IntelligentStockDataReader dataReader;

    @Override
    public XmlData readData(String market) {

        if (market.compareToIgnoreCase("capital") == 0){
            dataReader = new CapitalIntelligentStockDataReader();
        }else if (market.compareToIgnoreCase("money")== 0){
            dataReader = new MoneyIntelligentStockDataReader();
        }

        JsonData data = dataReader.read();
        
        return convertToXml(data);
    }

    private XmlData convertToXml(JsonData data) {
        return new XmlData(data.getData());
    }
}

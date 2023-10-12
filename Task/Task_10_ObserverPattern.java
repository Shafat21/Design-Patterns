import java.util.ArrayList;
import java.util.List;


interface StockSubject {
    void registerStockTrader(StockTrader trader);
    void removeStockTrader(StockTrader trader);
    void notifyStockTraders(String stockSymbol, double stockPrice);
}

class StockMarket implements StockSubject {
    private List<StockTrader> stockTraders;
    private String stockSymbol;
    private double stockPrice;

    public StockMarket(String stockSymbol, double initialPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = initialPrice;
        this.stockTraders = new ArrayList<>();
    }

    public void updateStockPrice(double newPrice) {
        stockPrice = newPrice;
        notifyStockTraders(stockSymbol, stockPrice);
    }

    @Override
    public void registerStockTrader(StockTrader trader) {
        stockTraders.add(trader);
    }

    @Override
    public void removeStockTrader(StockTrader trader) {
        stockTraders.remove(trader);
    }

    @Override
    public void notifyStockTraders(String stockSymbol, double stockPrice) {
        for (StockTrader trader : stockTraders) {
            trader.update(stockSymbol, stockPrice);
        }
    }
}


interface StockTrader {
    void update(String stockSymbol, double stockPrice);
}


class IndividualStockTrader implements StockTrader {
    private String name;

    public IndividualStockTrader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(name + " received an update for " + stockSymbol + ": $" + stockPrice);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
    
        StockMarket companyXStockMarket = new StockMarket("Company X", 100.0);

    
        StockTrader trader1 = new IndividualStockTrader("Trader 1");
        StockTrader trader2 = new IndividualStockTrader("Trader 2");

        
        companyXStockMarket.registerStockTrader(trader1);
        companyXStockMarket.registerStockTrader(trader2);

    
        companyXStockMarket.updateStockPrice(105.0);
        companyXStockMarket.updateStockPrice(98.5);

    
        companyXStockMarket.removeStockTrader(trader2);

    
        companyXStockMarket.updateStockPrice(110.5);
    }
}

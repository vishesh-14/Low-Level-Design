package behavioral_patterns.Strategy;

public class ShippingCostService {
    private ShippingStrategy strategy;
    public ShippingCostService(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
    public double calculateShippingCost(Order order) {
        if(strategy == null){
            throw new IllegalStateException("Shipping strategy not set");
        }
        double cost = strategy.calculateCost(order);
        System.out.println("Calculated Shipping Cost: $" + cost);
        return cost;
    }
}

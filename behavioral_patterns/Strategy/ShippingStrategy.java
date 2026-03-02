package behavioral_patterns.Strategy;

public interface ShippingStrategy {
    double calculateCost(Order order);
}

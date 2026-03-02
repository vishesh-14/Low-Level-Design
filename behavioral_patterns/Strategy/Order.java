package behavioral_patterns.Strategy;

public class Order {
    private String orderId;
    private double weight;
    private String destinationZone;

    public Order(String orderId,double weight,String destinationZone) {
        this.orderId = orderId;
        this.weight = weight;
        this.destinationZone = destinationZone;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getWeight() {
        return weight;
    }

    public String getDestinationZone() {
        return destinationZone;
    }

    public void setDestinationZone(String destinationZone) {
        this.destinationZone = destinationZone;
    }
}

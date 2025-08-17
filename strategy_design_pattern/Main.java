package strategy_design_pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle normalVehicle = new Vehicle(new NormalDrive());
        Vehicle strategyVehicle = new Vehicle(new StratergyDrive());
        normalVehicle.drive();
        strategyVehicle.drive();
    }
}

package strategy_design_pattern;

public class NormalDrive implements Drive {

    @Override
    public void drive() {
        System.out.println("Driving normally.");
    }
}

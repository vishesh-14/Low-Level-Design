package decorater_design_pattern;

public class CornDecorater extends PizzaDecorater{

    CornDecorater(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Corn";
    }

    @Override
    public double cost() {
        return pizza.cost()+12.15;
    }
}

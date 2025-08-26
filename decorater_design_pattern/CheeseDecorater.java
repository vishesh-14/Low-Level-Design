package decorater_design_pattern;

public class CheeseDecorater extends PizzaDecorater{

    CheeseDecorater(Pizza pizza) {
        super(pizza);
    }
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost()+10.15;
    }
}

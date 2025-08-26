package decorater_design_pattern;

public abstract class PizzaDecorater implements Pizza {
    protected Pizza pizza;

    public PizzaDecorater(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
    @Override
    public double cost() {
        return pizza.cost();
    }
}

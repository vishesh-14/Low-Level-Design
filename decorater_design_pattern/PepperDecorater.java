package decorater_design_pattern;

public class PepperDecorater extends PizzaDecorater{
    PepperDecorater(Pizza pizza){
        super(pizza);
    }
    @Override
    public  String getDescription(){
        return pizza.getDescription()+", Pepper";
    }
    @Override
    public  double cost(){
        return pizza.cost()+15.15;
    }
}

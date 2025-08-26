package decorater_design_pattern;

public class Main {

    public static void main(String[] args) {
        Pizza pizza  = new PlainPizza();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.cost());
        Pizza pizza1 = new CheeseDecorater(new PlainPizza());
        System.out.println(pizza1.getDescription() + " Cost: " + pizza1.cost());
        Pizza pizza2 = new PepperDecorater(new CheeseDecorater(new PlainPizza()));
        System.out.println(pizza2.getDescription() + " Cost: " + pizza2.cost());
        Pizza pizza3 = new CornDecorater(new PepperDecorater(new CheeseDecorater(new PlainPizza())));
        System.out.println(pizza3.getDescription() + " Cost: " + pizza3.cost());
    }
}

package factory_design_pattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void calcuateArea() {
        System.out.println("Calculating area of Rectangle");
    }
}

package factory_design_pattern;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void calcuateArea() {
        System.out.println("Calculating area of Triangle");
    }
}

package factory_design_pattern;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public void calcuateArea() {
        System.out.println("Calculating area of Square");
    }
}

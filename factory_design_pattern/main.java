package factory_design_pattern;

public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeType.Triangle);
        shape1.draw();
        shape1.calcuateArea();
        Shape shape2 = shapeFactory.getShape(ShapeType.Rectangle);
        shape2.draw();
        shape2.calcuateArea();
        Shape shape3 = shapeFactory.getShape(ShapeType.Square);
        shape3.draw();
        shape3.calcuateArea();
    }
}

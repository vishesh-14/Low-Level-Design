package factory_design_pattern;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case Triangle:
                return new Triangle();
            case Square:
                return new Square();
            case Rectangle:
                return new Rectangle();
            default:
                return null;
        }
    }
}

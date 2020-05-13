// Use Factory to get object of concrete class by passing information such as type.
public class FactoryPatternDemo {

    public static void main(final String[] args) {
        final ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call its draw method.
        final Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call draw method of Circle
        shape1.draw();

        // get an object of Rectangle and call its draw method.
        final Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // call draw method of Rectangle
        shape2.draw();

        // get an object of Square and call its draw method.
        final Shape shape3 = shapeFactory.getShape("SQUARE");
 
       //call draw method of square
       shape3.draw();
    }
 }

// Create a class implementing Shape interface.
public class RoundedSquare implements Shape {
    
    // Add a unimplemented method.
    // Indicates that a method is intended to override a method in a supertype.
    @Override
    public void draw() {
        System.out.println("Inside RoundSquare::draw() method.");
    }
}

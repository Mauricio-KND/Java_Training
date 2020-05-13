# Factory Pattern
Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

### Implementation
We're going to create a Shape interface and concrete classes implementing the Shape interface.

FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.

![FactoryPatternDemo Workflow](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)

### Step 1
Create an interface (Shape.java).
### Step 2
Create concrete classes (Rectangle.java, Square.java and Circle.java.) implementing the same interface (Shape.java).
### Step 3
Create a Factory (ShapeFactory.java) to generate object of concrete class based on given information.
### Step 4
Use the Factory (FactoryPatternDemo.java) to get object of concrete class by passing an information such as type.

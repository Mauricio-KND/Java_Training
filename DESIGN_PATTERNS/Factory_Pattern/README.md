# Factory Pattern
Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

### Implementation
We're going to create a Shape interface and concrete classes implementing the Shape interface.

FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object. It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.

![FactoryPatternDemo Workflow](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)



# Bridge Pattern
The Bridge Pattern is used when we need to decouple an abstraction from its implementation so the two can vary independently. This type of design pattern comes under structural pattern since this pattern decouples implementation class and abstract class by providing a bridge structure between them.

This pattern involves an interface that acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. Both types of classes can be altered structurally without affecting each other.
We are demonstrating the use of Bridge patterns via the following example in which a circle can be drawn in different colors using the same abstract class method but different bridge implementer classes.

### Implementation
We have a DrawAPI interface which is acting as a bridge implementer and concrete classes RedCircle, GreenCircle implementing the DrawAPI interface. The Shape is an abstract class and will use the object of DrawAPI. BridgePatternDemo will use Shape class to draw the different colored circles.
![BridgePatternDemo Workflow](https://www.tutorialspoint.com/design_pattern/images/bridge_pattern_uml_diagram.jpg)

### Step 1
Create bridge implementer interface (DrawAPI.java).
### Step 2
Create concrete bridge implementer classes (RedCircle.java, GreenCircle.java) implementing the DrawAPI interface.
### Step 3
Create an abstract class Shape (Shape.java) using the DrawAPI interface.
### Step 4
Create concrete class (Circle.java) implementing the Shape interface.
### Step 5
Use the Shape and DrawAPI classes to draw different colored circles (BridgePatternDemo.java).
### Output











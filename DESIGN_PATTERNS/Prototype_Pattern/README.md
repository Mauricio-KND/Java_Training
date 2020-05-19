# Prototype Pattern
**Prototype pattern** refers to creating duplicate object while keeping performance in mind.

This pattern involves implementing a prototype interface that tells to create a clone of the current object. This pattern is used when the creation of the object directly is expensive. For example, an object is going to be created after a costly database operation. We can store the object, returns its clone on the next request, and update the database as and when needed thus reducing database calls.

### Implementation
We're going to create an abstract class Shape and concrete classes extending the Shape class. A class ShapeCache is defined as a next step in which stores shape objects in a Hashtable and return their clone when requested.

PrototypPatternDemo, our demo class will use the ShapeCache class to get a Shape object.
![PrototypePatternDemo Workflow](https://www.tutorialspoint.com/design_pattern/images/prototype_pattern_uml_diagram.jpg)
### Step 1
Create an abstract class (Shape.java) implementing Clonable interface.
### Step 2
Create concrete classes (Rectangle.java, Square.java, Circle.java) extending the above class.
### Step 3
Create a class (ShapeCache.java) to get concrete classes from database and store them in a Hashtable.
### Step 4
PrototypePatternDemo (PrototypePatternDemo.java) uses ShapeCache class to get clones of shapes stored in a Hashtable.

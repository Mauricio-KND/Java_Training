# Builder Pattern
**Builder pattern** builds a complex object using simple objects and using a step by step approach. This type of design pattern provides one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.

### Implementation
We have considered a business case of fast-food restaurant where a typical meal could be a burger and a cold drink. Burger could be either a Veg Burger or Chicken Burger and will be packed by a wrapper. Cold drink could be either a coke or pepsi and will be packed in a bottle.

We are going to create an **Item interface** representing food items such as burgers and cold drinks and concrete classes implementing the Item interface and a **Packing interface** representing packaging of food items and concrete classes implementing the Packing interface as burger would be packed in wrapper and cold drink would be packed as bottle.

We then create a Meal class having ArrayList of Item and a MealBuilder to build different types of Meal objects by combining Item. BuilderPatternDemo, our demo class will use MealBuilder to build a Meal.

![BuilderPatternDemo Workflow](https://www.tutorialspoint.com/design_pattern/images/builder_pattern_uml_diagram.jpg)

### Step 1
Create an interface Item representing food item (Item.java) and packing (Packing.java).
### Step 2
Create concrete classes (Wrapper.java, Bottle.java) implementing the Packing interface.
### Step 3
Create abstract classes (Burger.java, ColdDrink.java) implementing the item interface providing default functionalities.
### Step 4
Create concrete classes (VegBurger.java, ChickenBurger.java, Coke.java, Pepsi.java)extending Burger and ColdDrink classes.
### Step 5
Create a Meal class (Meal.java) having Item objects defined above.
### Step 6
Create a MealBuilder class (MealBuilder.java), the actual builder class responsible to create Meal objects.
### Step 7
BuilderPatternDemo (BuilderPatternDemo.java) uses MealBuider to demonstrate builder pattern.
### OUTPUT
```
Veg Meal
Item : Veg Burger, Packing : Wrapper, Price : 25.0
Item : Coke, Packing : Bottle, Price : 30.0
Total Cost: 55.0

Non-Veg Meal
Item : Chicken Burger, Packing : Wrapper, Price : 50.5
Item : Pepsi, Packing : Bottle, Price : 35.0
Total Cost: 85.5
bash-3.2$ 
```



# Abstract Factory Pattern Example

This repository contains an implementation of the abstract factory pattern in Java using a pizza ordering system as an example.

Abstract Factory Pattern
The abstract factory pattern provides an interface for creating families of related objects without specifying their concrete classes. In other words, the abstract factory pattern allows us to create objects that belong to a particular family of objects.

Pizza Ordering System
In this example, we have a pizza ordering system that allows customers to order different types of pizza, such as cheese pizza or pepperoni pizza. The pizza ordering system uses the abstract factory pattern to create families of related pizza components, such as crust, sauce, and toppings.

We have defined the following components and their concrete implementations:

Crust - ThinCrust and ThickCrust
Sauce - MarinaraSauce and BBQSauce
Topping - Cheese and Pepperoni
We have also defined two concrete implementations of the PizzaComponentFactory interface:

NYStylePizzaComponentFactory - creates pizza components in the New York style
ChicagoStylePizzaComponentFactory - creates pizza components in the Chicago style
We have defined an abstract Pizza class that uses the pizza components created by the pizza component factories. We have also defined concrete CheesePizza and PepperoniPizza classes that extend the Pizza class.

Finally, we have defined a PizzaStore class that creates pizzas using the pizza component factories.

Usage
To run the pizza ordering system, simply compile and run the Main class. The Main class creates instances of the PizzaStore class and orders pizzas using the pizza component factories.

Conclusion
The abstract factory pattern is a useful design pattern for creating families of related objects. In this example, we used the abstract factory pattern to create families of related pizza components, which allowed us to create pizzas in different styles.

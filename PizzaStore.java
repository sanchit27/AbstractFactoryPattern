public class PizzaStore {
    private PizzaComponentFactory factory;

    public PizzaStore(PizzaComponentFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza("Cheese", factory);
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza("Pepperoni", factory);
        }

        if (pizza != null) {
            pizza.bake();
            pizza.cut();
            pizza.box(); }

            return pizza;
        }
    }
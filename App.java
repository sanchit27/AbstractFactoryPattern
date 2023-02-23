public class App {
    public static void main(String[] args) {
    PizzaComponentFactory nyFactory = new NYStylePizzaComponentFactory();
    PizzaStore nyStore = new PizzaStore(nyFactory);

    PizzaComponentFactory chicagoFactory = new ChicagoStylePizzaComponentFactory();
    PizzaStore chicagoStore = new PizzaStore(chicagoFactory);

    Pizza cheesePizza = nyStore.orderPizza("cheese");
    System.out.println("Ordered a " + cheesePizza + "\n");

    Pizza pepperoniPizza = chicagoStore.orderPizza("pepperoni");
    System.out.println("Ordered a " + pepperoniPizza + "\n");
}

    }


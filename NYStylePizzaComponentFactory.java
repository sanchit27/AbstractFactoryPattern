public class NYStylePizzaComponentFactory implements PizzaComponentFactory {
    public Crust createCrust() {
        return new ThinCrust();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Topping createTopping() {
        return new Cheese();
    }
}
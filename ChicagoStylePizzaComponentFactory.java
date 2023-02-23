class ChicagoStylePizzaComponentFactory implements PizzaComponentFactory {
    public Crust createCrust() {
        return new ThickCrust();
    }

    public Sauce createSauce() {
        return new BBQSauce();
    }

    public Topping createTopping() {
        return new Pepperoni();
    }
}

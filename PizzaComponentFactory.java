public interface PizzaComponentFactory {
    Crust createCrust();
    Sauce createSauce();
    Topping createTopping();
}
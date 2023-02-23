abstract class Pizza {
    private String name;
    private Crust crust;
    private Sauce sauce;
    private Topping topping;

    public Pizza(String name, PizzaComponentFactory factory) {
        this.name = name;
        this.crust = factory.createCrust();
        this.sauce = factory.createSauce();
        this.topping = factory.createTopping();
    }

    public void bake() {
        System.out.println("Baking " + name + " pizza...");
    }

    public void cut() {
        System.out.println("Cutting " + name + " pizza...");
    }

    public void box() {
        System.out.println("Boxing " + name + " pizza...");
    }

    public String toString() {
        return name + " pizza with " + crust + ", " + sauce + ", and " + topping;
    }
}
package SimpleFactory;

public class PizzaFactory {

    public Pizza createSmallPizza() {
        // DB, File, API
        return new Pizza(4);
    }

    public Pizza createMediumPizza() {
        return new Pizza(8);
    }

    public Pizza createLargePizza() {
        return new Pizza(12);
    }

}

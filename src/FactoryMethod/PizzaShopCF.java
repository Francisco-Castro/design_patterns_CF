package FactoryMethod;

public class PizzaShopCF implements IPizzaFactory{

    @Override
    public Pizza createPizza(String type) {

        if (type.equals("Pepperoni")) {
            return new Pizza(8, "Pepperoni");
        }

        if (type.equals("Hawaiian")) {
            return new Pizza(8, "Hawaiian");
        }

        if (type.equals("Pepperoni edge")) {
            return new PizzaEdgeStuffed(12, "Pepperoni edge");
        }

        return null;
    }

}

package FactoryMethod;

public class Main {

    public static void main(String[] args) {

        IPizzaFactory pizzaShopCF = new PizzaShopCF();

        Pizza hawaiian = pizzaShopCF.createPizza("Hawaiian");
        Pizza pepperoni = pizzaShopCF.createPizza("Pepperoni");

        System.out.println(hawaiian);
        System.out.println(pepperoni);

        Pizza pepperoni_edge = pizzaShopCF.createPizza("Pepperoni edge");

        System.out.println(pepperoni_edge);

    }

}

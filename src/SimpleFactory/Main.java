package SimpleFactory;

public class Main {

    public static void main(String[] args) {

//        Pizza pizzaPepperoni = new Pizza(8);
//
//        System.out.println(pizzaPepperoni);

        PizzaFactory pizzaEmi = new PizzaFactory();

        Pizza mediumPizza = pizzaEmi.createMediumPizza();

        System.out.println( mediumPizza );


    }

}

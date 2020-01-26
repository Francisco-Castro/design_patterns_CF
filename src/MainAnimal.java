public class MainAnimal {


    public static void main(String[] args) {


        Jaguar jaguar = new Jaguar(3, (float) 4.5);

        jaguar.eat();
        jaguar.sleep();

        jaguar.roar();
        jaguar.hunt();

        Jaguar jaguar1 = new Jaguar();

        System.out.println(jaguar1);


    }
}

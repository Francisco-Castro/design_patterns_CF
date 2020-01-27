public class LiskovMain {

    public static void main(String[] args) {

//        Jaguar jaguar = new Jaguar(10, 20f);


//        IFeline jaguar = new Jaguar(10, 20f);
//        Jaguar jaguar = new Jaguar(10, 20f);
        IFelineWild jaguar = new Jaguar(10, 20f);

        jaguar.hunt();




    }
}

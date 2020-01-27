package Singleton;

public class MainForConcurrent {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connectionDB = ConnectionDB.getConnection();
                System.out.println(connectionDB.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connectionDB = ConnectionDB.getConnection();
                System.out.println(connectionDB.hashCode());
            }
        });

        t1.start();
        t2.start();


    }

}

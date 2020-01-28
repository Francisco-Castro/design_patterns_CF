package Adapter;

public class Main {

    // Extend our app

    /**
     * Step 1. Generate a new class adapater
     * Step 2. Use both interfaces
     * Step 3. Modify the behaviour that the client (Main) wants to use
     */


    public static void main(String[] args) {

//        IConnectionSQL connection = new ConnectionMySQL();
        IConnectionSQL connection = new AdapterDB( new ConnectionMongoDB() );

        connection.connection();

        String result = connection.runQuery();
        System.out.println(result);


    }

}

package Singleton;

public class Main {

    // Only one cart shop
    // Access to DB, session, cookies

    public static void main(String[] args) {

        // Step 3. Call getConnection
        ConnectionDB connectionDB = ConnectionDB.getConnection();
        ConnectionDB connectionDB2 = ConnectionDB.getConnection();

        System.out.println( connectionDB.hashCode() );
        System.out.println( connectionDB2.hashCode() );

    }

}

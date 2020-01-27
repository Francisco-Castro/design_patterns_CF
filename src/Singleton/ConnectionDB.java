package Singleton;

public class ConnectionDB {

    // Step 4. Create a static variable of the same class
    private static ConnectionDB connectionDB;

    // Step 1. Set private the constructor.
    private ConnectionDB() {
    }

    // Step2. Generate an static method that return an object of the same type.
    public static ConnectionDB getConnection() {

        if (connectionDB == null) { // No instantiated
            connectionDB = new ConnectionDB();
        }

        return connectionDB;
    }


}

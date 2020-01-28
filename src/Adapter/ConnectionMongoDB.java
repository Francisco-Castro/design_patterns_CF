package Adapter;

public class ConnectionMongoDB implements IConnectionNoSQL{
    @Override
    public void connection() {
        System.out.println("Connection with MongoDB");
    }

    @Override
    public String executeSentence() {
        return "Query to MongoDB";
    }

}

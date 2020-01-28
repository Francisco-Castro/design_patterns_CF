package Adapter;

public class ConnectionMySQL implements IConnectionSQL {

    @Override
    public void connection() {
        System.out.println("Connection with MySQL");
    }

    @Override
    public String runQuery() {
        return "Query to MySQL";
    }

}

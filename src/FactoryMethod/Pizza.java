package FactoryMethod;

public class Pizza {

    private int numberOfSlices;
    private String type;

    public Pizza(int numberOfSlices, String type) {
        this.numberOfSlices = numberOfSlices;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "numberOfSlices=" + numberOfSlices +
                ", type='" + type + '\'' +
                '}';
    }
}

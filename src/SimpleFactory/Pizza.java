package SimpleFactory;

public class Pizza {

    private int numberOfSlices;

    public Pizza(int slices) {
        this.numberOfSlices = slices;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "numberOfSlices=" + numberOfSlices +
                '}';
    }
}

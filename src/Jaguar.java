public class Jaguar extends Animal implements IFelineWild {

    private int age;
    private float weight;

    public Jaguar(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public Jaguar() {
        this.setAge(0);
        this.setWeight(0);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("The jaguar is sleeping");
    }

    @Override
    public void sleep() {
        System.out.println("The jaguar is sleeping");
    }

    @Override
    public void hunt() {
        System.out.println("The jaguar is hunting");
    }

    @Override
    public String toString() {
        return "Jaguar{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void roar() {
        System.out.println("The jaguar is roaring");
    }
}

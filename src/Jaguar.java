public class Jaguar extends Animal {

    int age;
    float weight;

    public Jaguar(int age, float weight) {
        this.age = age;
        this.weight = weight;
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
}

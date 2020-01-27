package Builder;

public class User {

    // Required Attributes
    private String name;
    private String lastName;

    // Optional Attributes
    private String email;
    private String telephone;
    private String address;

    // Step 1. Generate a private constructor with required parameters
    private User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // Step 2. Create a static method that return an Object of the same class. Usually named Make()
    public static User Make(String name, String lastName) {
        return new User(name, lastName);
    }

    // Step 3. Create Setter of the remain variables and return the same object (this).
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    // Step 4. Create a method that return the final object.
    public User Build() {
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + (email == null ? "" : email) + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

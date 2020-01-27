package Builder;

public class User {

    // Required Attributes
    private String name;
    private String lastName;

    private boolean availableContact; // Optional; True: email, tel, add activated. False: no available those before.

    /**
     * Exercise: add attributes: methodPay and token.
     * String methodPay: Only assign a value if email, add, and tel have a value.
     * String token:  Once methodPay has a value so enable methodPay
     * */

    // Optional Attributes
    private String email;
    private String telephone;
    private String address;

    // Step 1. Generate a private constructor with required parameters
    private User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

        this.availableContact = false;

        this.email = "";
        this.telephone = "";
        this.address = "";

    }

    public BuilderUser setAvailableContact(boolean availableContact) {

        if (!availableContact) {
            throw new IllegalArgumentException("It's not possible to assigning a false value to available contact");
        }

        this.availableContact = true;

        return new BuilderUser(this);
    }

    // Step 2. Create a static method that return an Object of the same class. Usually named Make()
    public static User Make(String name, String lastName) {
        return new User(name, lastName);
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

    public static class BuilderUser{

        // Create a field ofr user of the type User
        private User user;

        // Create constructor
        public BuilderUser(User user) {
            this.user = user;
        }

        // Move setters and change the return to BuilderUser
        public BuilderUser setEmail(String email) {
            user.email = email;
            return this;
        }

        public BuilderUser setTelephone(String telephone) {
            user.telephone = telephone;
            return this;
        }

        public BuilderUser setAddress(String address) {
            user.address = address;
            return this;
        }

        // Add the Build method that returns the user attribute
        public User Build() {
            return user;
        }
    }


}

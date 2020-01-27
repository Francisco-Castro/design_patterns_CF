package Builder;

public class Main {

    public static void main(String[] args) {

        User user = User.Make("Emi", "Cas")
                .setEmail("emi@emi.com")
                .setTelephone("XXX-XXX-XXXX")
                .setAddress("222 Av. 1")
                .Build();

        System.out.println(user);


    }

}

package Composite;

public class Main {


    public static void main(String[] args) {

        Menu menu = new Menu();

        Menu menu2 = new Menu();
        Menu menu3 = new Menu();

        Menu menu4 = new Menu();
        Menu menu5 = new Menu();

        // Step 3. Add menus 4 and 5 to menu 3
        menu3.addMenu(menu4);
        menu3.addMenu(menu5);

        // Step 3. Add menus 2 and 3 to menu
        menu.addMenu(menu2);
        menu.addMenu(menu3);


        menu.open();
        menu.close();




    }

}

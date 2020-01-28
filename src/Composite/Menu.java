package Composite;

import java.util.ArrayList;

public class Menu implements IMenu {

    // Step 1. Generate a list
    private ArrayList<IMenu> menus;

    public Menu() {
        this.menus = new ArrayList<>();
    }

    // Step 2. Add 2 methods: addMenu and getMenu
    public void addMenu(IMenu menu) {
        this.menus.add(menu);
    }

    public IMenu getMenu(int pos) {
        return this.menus.get(pos);
    }

    @Override
    public boolean open() {
        System.out.println("Open!!!");
        return false;
    }

    @Override
    public boolean close() {
        System.out.println("Closed!!!");
        return true;
    }

}

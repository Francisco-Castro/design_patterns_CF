package AbstractFactory;

public class AppleStore implements IAbstractFactory {

    @Override
    public IComputer createComputer() {
        return new MacBookPro();
    }

    @Override
    public ITablet createTablet() {
        return new Ipad();
    }

}

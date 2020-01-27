public class DependencyInversionMain {

    public static void main(String[] args) {

        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();

        Computer computer = new Computer(keyBoard, mouse);

        computer.turnOn();

    }
}

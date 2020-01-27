public class Computer {

    private KeyBoard keyBoard;
    private Mouse mouse;

    public Computer(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public void turnOn() {
        this.keyBoard.connect();
        this.mouse.connect();
    }

}

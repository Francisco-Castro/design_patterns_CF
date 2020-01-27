public class Computer {

    private IKeyboard keyBoard;
    private IMouse mouse;

    public Computer(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public void turnOn() {
        this.keyBoard.connect();
        this.mouse.connect();
    }

}

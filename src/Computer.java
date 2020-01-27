public class Computer {

    private KeyBoard keyBoard;
    private Mouse mouse;

    public Computer() {
        this.keyBoard = new KeyBoard();
        this.mouse = new Mouse();
    }

    public void turnOn() {
        this.keyBoard.connect();
        this.mouse.connect();
    }

}

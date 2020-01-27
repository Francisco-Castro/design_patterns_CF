public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(10, 5);

        Presentation presentation = new Presentation();

        presentation.print(rectangle);
        presentation.print(triangle);

    }

}

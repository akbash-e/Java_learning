package section22_inheritans3;

public class Main {
    static void main() {
        Rectangle rect = new Rectangle(10, 20);
        Triangle triangle = new Triangle(10, 10, 10);
        rect.showPerimeter();
        triangle.showPerimeter();
    }
}

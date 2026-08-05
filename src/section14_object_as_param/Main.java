package section14_object_as_param;

public class Main {
    public static void main(String[] args) {
        Box currentBox = new Box(1, 2, 4);
        Box anotherBox = currentBox.copy();
        Box newBox = currentBox.increase();
        currentBox.volumeShow();
        newBox.volumeShow();
        anotherBox.volumeShow();
    }
}

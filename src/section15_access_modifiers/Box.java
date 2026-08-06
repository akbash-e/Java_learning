package section15_access_modifiers;
/*Доработайте класс Box таким образом, чтобы везде использовались правильные модификаторы доступа*/
public class Box {
    private double length, width, height;

    public Box(double legth, double width, double height) {
        this.length = legth;
        this.width = width;
        this.height = height;
    }

   public Box(double size) {
        this(size, size, size);
    }

    private void volumeShow() {
        System.out.println(length * width * height);
    }

    public Box copy(){
        return new Box(length, width, height);
    }
    public Box increase() {
        return new Box(length * 2, width * 2, height * 2);
    }
}

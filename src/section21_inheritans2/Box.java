package section21_inheritans2;

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

    public void showInfo(){
        System.out.println("Width: " + width + " Length: " + length + " Height: ");
    }
    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
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


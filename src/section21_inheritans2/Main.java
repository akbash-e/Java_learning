package section21_inheritans2;

public class Main {
    static void main() {
        Cat cat = new Cat();
        Lion lion = new Lion();
        cat.eat();
        lion.eat();

        Box box = new Box(10);
        WeightBox weightBox = new WeightBox(10, 20);
        box.showInfo();
        weightBox.showInfo();

    }
}

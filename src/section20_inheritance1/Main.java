package section20_inheritance1;

public class Main {
    static void main() {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());
    }
}

package section13_overloading_method_constructor;

public class Main {
    static void main() {
        Monster monster1 = new Monster(3);
        monster1.voice();
        monster1.voice(2);
        monster1.voice(3, "aaaaaaa");
    }
}

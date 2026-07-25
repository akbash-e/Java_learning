package section9_intro_OOP;

public class Main {
    static void main() {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        human1.age = 30;
        human2.age = 27;
        human3.age = 25;
        human1.name = "John";
        human2.name = "Alex";
        human3.name = "Bob";
        human1.weight = 75;
        human2.weight = 75;
        human3.weight = 75;
        double averageAge = (double)(human1.age + human2.age + human3.age)/3;
        System.out.println(averageAge);
    }
}

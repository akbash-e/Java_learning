package section10_intro_methods;
/*Создайте класс Dog(собака) с полями(имя, порода и вес). После этого, создайте метод,
который возвращает всю информацию об этой собаке в виде строки(имя такое-то, порода такая-то,
вес такой-то). Дальше, в классе Main, создайте экземпляр класса Dog и вызовите ваш метод,
который возвращает информацию о собаке.*/
public class Main {
    static void main() {
        Dog dog = new Dog();
        dog.name = "Bobik";
        dog.breed = "Korgi";
        dog.weight = 7;
        System.out.println( dog.showInfo());
    }
}

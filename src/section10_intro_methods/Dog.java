package section10_intro_methods;
/*Создайте класс Dog(собака) с полями(имя, порода и вес). После этого, создайте метод,
который возвращает всю информацию об этой собаке в виде строки(имя такое-то, порода такая-то,
вес такой-то). Дальше, в классе Main, создайте экземпляр класса Dog и вызовите ваш метод,
который возвращает информацию о собаке.*/
public class Dog {
    String name;
    String breed;
    double weight;

    String showInfo() {
        return "Name: " + name + " Breed: " + breed + " Weight: " + weight;
    }
}

package section15_access_modifiers;

public class Main {
    static void main() {
        Person person = new Person("John", 25);
        person.setAge(40);
        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
    }
}

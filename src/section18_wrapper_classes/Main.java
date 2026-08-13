package section18_wrapper_classes;

import section15_access_modifiers.Person;

public class Main {
    static void main() {
       String s = "This is John. He is 27 years old.";
       String name = s.substring(8, 12);
       String ageString = s.substring(20, 22);
       int age = Integer.parseInt(ageString);
        Person person = new Person(name, age);
        System.out.println(person.getName() + " " + person.getAge());
    }
}

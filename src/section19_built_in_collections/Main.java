package section19_built_in_collections;

import java.util.ArrayList;


/*Создайте две коллекции. Первая коллекция будет содержать имена(пусть их будет 5). Вторая коллекция будет содержать числа
(в ней будет 5 каких-нибудь чисел, например, от 0 до 4 включительно), после чего, создайте третью коллекцию, которая будет
хранить строки(в ней будет значение: число - имя, где число вы возьмёте из коллекции с числами, а имя возьмёте из коллекции
с именами). Пример: у вас есть коллекция чисел от 0 до 5 и есть несколько имён, тогда вы должны создать третью коллекцию в
которой по индексу 0 будет лежать следующее значение: 0 - John, где 0 вы возьмёте из коллекции чисел, а John из коллекции
имён.*/
public class Main {
    static void main() {
        ArrayList<String> names = getNames();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
          for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < names.size(); i++) {
            result.add(numbers.get(i) + " - " + names.get(i));
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
    private static ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Olivia");
        names.add("Emma");
        names.add("Max");
        names.add("Nick");
        return names;
    }
}

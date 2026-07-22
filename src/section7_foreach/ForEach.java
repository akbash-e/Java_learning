package section7_foreach;
/*Создайте массив строк, который содержит имена студентов и заполните этот массив несколькими
значениями.*/
public class ForEach {
    static void main() {
        String[] NamesOfStudents = {"John", "Mary", "Ann", "Bob"};
        for (String name : NamesOfStudents) {
            System.out.println(name);
        }
    }
}

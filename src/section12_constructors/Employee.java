package section12_constructors;
/*Создайте класс работник(Employee), у работника будут поля(имя, должность и зарплата),
создайте конструктор, в котором все эти поля будут проинициализированы и добавьте метод(showInfo),
который выводит всю информацию об этом сотруднике в консоль.*/
public class Employee {
    String name;
    String position;
    double salary;

    Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Name = " + name + " Position = " + position + " Salary = " + salary);
    }
}

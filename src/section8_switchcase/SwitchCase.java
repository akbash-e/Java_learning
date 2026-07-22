package section8_switchcase;
/*Напишите программу, которая на вход принимает название месяца и выводит в консоль, к какому
сезону относится этот месяц. (Например, если вы введёте июнь, то программа выведет строчку - лето,
если вы введёте декабрь, то программа выведет строчку - зима). Для решения задачи, воспользуйтесь
конструкцией switch-case.*/
public class SwitchCase {
    static void main() {
        String month = "April";
        switch (month) {
            case "June", "July", "August":
                System.out.println("Summer");
                break;
            case "March", "April", "May":
                System.out.println("Spring");
                break;
            case "December", "January", "February":
                System.out.println("Winter");
                break;
            case "September", "October", "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown month");
        }
    }
}

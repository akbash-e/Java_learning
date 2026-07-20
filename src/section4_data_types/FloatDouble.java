package section4_data_types;
//Создайте несколько переменных типа int, в каждой из которых будет храниться возраст членов
// вашей семьи, и после этого посчитайте средний возраст всех этих людей.

public class FloatDouble {
    static void main() {
        int age_f = 72;
        int age_s = 46;
        int age_me = 43;
        int age_M = 21;
        double average_age = (age_f + age_s + age_me + age_M)/4.0;
        System.out.println(average_age);
    }
}

package section5_loops;
/*Нужно вывести в консоль все чётные числа от 0 до 1000, т.е. выводить в консоль нужно
только те числа, которые без остатка делятся на 2.*/
public class Loop_While {
    static void main() {
        int i = 0;
        while (i <= 1000){
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

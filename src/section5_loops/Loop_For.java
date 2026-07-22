package section5_loops;
/*нужно при помощи цикла for вывести все числа от 1000 до 0, при чём выводить нужно только те числа,
 которые без остатка делятся на 3.*/
public class Loop_For {
    static void main() {
        for (int i = 1000; i >= 0 ; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

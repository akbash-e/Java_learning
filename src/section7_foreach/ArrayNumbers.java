package section7_foreach;
/*Вам нужно создать массив целых чисел размером в 100 элементов и проинициализировать его
(Т.Е. Присвоить значения его элементам от 100 до 200 Т.Е. значение элемента с индексом 0 будет 100,
 дальше будет элемент 101, потом 102 и так далее до 199). После этого при помощи цикла for each,
 выведите все значения в консоль.*/
public class ArrayNumbers {
    static void main() {
        int[] arrayOfNumbers = new int[100];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i+100;
        }
        for(int number : arrayOfNumbers){
            System.out.println(number);
        }
    }
}

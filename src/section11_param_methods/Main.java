package section11_param_methods;
/*Создайте класс прямоугольник и в этом классе будет два поля - длина(length) и ширина(width) и
создайте в этом классе два метода - первый метод параметризированный, он устанавливает значение
длины и ширины в этот прямоугольник, второй метод без параметров, он возвращает площадь
прямоугольника.*/
public class Main {
    static void main() {
        Rectangle rec1 = new Rectangle();
        rec1.setDimens(10, 20);
        System.out.println(rec1.getArea());
    }
}

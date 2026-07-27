package section11_param_methods;
/*Создайте класс прямоугольник и в этом классе будет два поля - длина(length) и ширина(width)
и создайте в этом классе два метода - первый метод параметризированный, он устанавливает значение
длины и ширины в этот прямоугольник, второй метод без параметров, он возвращает площадь
прямоугольника.*/
public class Rectangle {
    int length;
    int width;

    void setDimens(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getArea() {
        return length * width;
    }
}

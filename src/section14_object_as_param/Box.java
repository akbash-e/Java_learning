package section14_object_as_param;
/*Первое задание. Вам нужно создать метод copy(), который возвращает новый объект Box. Этот метод возвращает точную копию той коробки, у которой вызывается
данный метод, например(у нас будет коробка, у которой все размеры равны 10, тогда мы можем создать другую коробку, вызвав у текущей метод copy() и все её размеры
будут совпадать с коробкой current).

Второе задание. Создайте метод increase(увеличить), этот метод возвращает коробку, у которой все размеры в два раза больше той, у которой был вызван данный метод,
например(если у нас есть коробка, у которой все размеры равны 10, то мы можем создать новую коробку, у первой вызвать метод increase(), в этом случае, у нас будет
создана новая коробка, у которой все размеры уже будут равны 20, т.е, в 2 раза больше, чем у первой коробки).*/
public class Box {
    double length, width, height;

    Box(double legth, double width, double height) {
        this.length = legth;
        this.width = width;
        this.height = height;
    }

    Box(double size) {
        this(size, size, size);
    }

    void volumeShow() {
        System.out.println(length * width * height);
    }

    Box copy(){
        return new Box(length, width, height);
    }
    Box increase() {
        return new Box(length * 2, width * 2, height * 2);
    }
}

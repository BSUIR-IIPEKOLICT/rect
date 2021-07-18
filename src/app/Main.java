package app;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа для работы с прямоугольниками");

        Scanner in = new Scanner(System.in);
        Rect rect1 = Rect.create("\nСоздание 1 прямоугольника\n", in);

        System.out.println("Периметр 1 прямоугольника: " + Rect.per(rect1));
        System.out.println("Площадь 1 прямоугольника: " + Rect.area(rect1));

        Rect rect2 = Rect.create("\nСоздание 2 прямоугольника\n", in);

        if (Rect.contains(rect1, rect2)) {
            System.out.println("1 прямоугольник содержится во 2.");
        } else {
            System.out.println("1 прямоугольник не содержится во 2.");
        }

        Rect rect3 = new Rect(356);
        System.out.println("\nДлина 3 прямоугольника: " + Rect.getW(rect3));
        System.out.println("Ширина 3 прямоугольника: " + Rect.getH(rect3));

        Rect rect4 = new Rect();
        System.out.println("\nДлина 4 прямоугольника: " + Rect.getW(rect4));
        System.out.println("Ширина 4 прямоугольника: " + Rect.getH(rect4));
    }
}

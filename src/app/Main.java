package app;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа для работы с прямоугольниками");

        Scanner in = new Scanner(System.in);
        Rect rect1 = Rect.create("\nСоздание 1 прямоугольника\n", in);

        System.out.println("Периметр 1 прямоугольника: " + rect1.per());
        System.out.println("Площадь 1 прямоугольника: " + rect1.area());

        Rect rect2 = Rect.create("\nСоздание 2 прямоугольника\n", in);

        if (Rect.contains(rect1, rect2)) {
            System.out.println("1 прямоугольник содержится во 2.");
        } else {
            System.out.println("1 прямоугольник не содержится во 2.");
        }

        Rect rect3 = new Rect(356);
        System.out.println("\nДлина 3 прямоугольника: " + rect3.getW());
        System.out.println("Ширина 3 прямоугольника: " + rect3.getH());

        Rect rect4 = new Rect();
        System.out.println("\nДлина 4 прямоугольника: " + rect4.getW());
        System.out.println("Ширина 4 прямоугольника: " + rect4.getH());

        Rect rect5 = new Rect(13, 63);
        rect5.setW(42);
        rect5.setH(14.25);
        System.out.println("\nРазмеры 5 прямоугольника: " + rect5.getW() + " x " + rect5.getH());
    }
}

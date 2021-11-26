package app;

import kotlin.jvm.JvmStatic;

public final class Main {
    @JvmStatic
    public static void main(String[] args) {
        System.out.println("Программа для работы с прямоугольниками");

        Rect rect1 = Rect.create("\nСоздание 1 прямоугольника\n");
        System.out.println("Параметры 1 прямоугольника: " + rect1);

        Rect rect2 = Rect.create("\nСоздание 2 прямоугольника\n");
        System.out.println("Параметры 2 прямоугольника: " + rect2);

        System.out.println(Rect.contains(rect1, rect2)
            ? "\n1 прямоугольник содержится во 2.\n"
            : "\n1 прямоугольник не содержится во 2.\n"
        );

        Rect[] rectangles = new Rect[]{
            new Rect(356),
            new Rect(),
            new Rect(13, 63),
            new Rect(13.2F, 12.4F)
        };

        rectangles[2].setW(42.0D);
        rectangles[2].setH(14.25D);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Параметры " + (i + 3) + " прямоугольника: " + rectangles[i]);
        }

        System.out.println("Всего создано прямоугольников: " + Rect.counter);
    }
}

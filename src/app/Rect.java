package app;
import java.util.Scanner;

public class Rect {

    private float w = 10;
    private float h = 10;

    public Rect(float w, float h) {
        this.w = w;
        this.h = h;
    }

    public Rect(float w) {
        this.w = w;
    }

    public Rect() {}

    public static Rect create(String text, Scanner in) {
        System.out.println(text);
        System.out.print("Введите длину прямоугольника: ");
        float w = in.nextFloat();
        System.out.print("Введите высоту прямоугольника: ");
        float h = in.nextFloat();

        return new Rect(w, h);
    }

    public static float per(Rect rect) {
        return 2 * rect.w + 2 * rect.h;
    }

    public static float area(Rect rect) {
        return rect.w * rect.h;
    }

    public static boolean contains(Rect rect1, Rect rect2) {
        return rect1.w <= rect2.w && rect1.h <= rect2.h;
    }

    public static float getW(Rect rect) {
        return rect.w;
    }

    public static float getH(Rect rect) {
        return rect.h;
    }
}
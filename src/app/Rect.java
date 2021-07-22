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

    public static boolean contains(Rect rect1, Rect rect2) { return rect1.w <= rect2.w && rect1.h <= rect2.h; }

    public float per() { return 2 * this.w + 2 * this.h; }

    public float area() { return this.w * this.h; }

    public void setW(float w) { this.w = w; }

    public void setH(float h) { this.h = h; }

    public float getW() { return this.w; }

    public float getH() { return this.h; }
}
package app;
import java.util.Scanner;

public class Rect {

    private double w = 10;
    private double h = 10;

    public Rect(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public Rect(double w) {
        this.w = w;
    }

    public Rect() {}

    public static Rect create(String text, Scanner in) {
        System.out.println(text);
        System.out.print("Введите длину прямоугольника: ");
        double w = in.nextDouble();
        System.out.print("Введите высоту прямоугольника: ");
        double h = in.nextDouble();

        return new Rect(w, h);
    }

    public static boolean contains(Rect rect1, Rect rect2) { return rect1.w <= rect2.w && rect1.h <= rect2.h; }

    public double per() { return 2 * this.w + 2 * this.h; }

    public double area() { return this.w * this.h; }

    public void setW(double w) { this.w = w; }

    public void setH(double h) { this.h = h; }

    public double getW() { return this.w; }

    public double getH() { return this.h; }
}
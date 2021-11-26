package app;

import kotlin.io.ConsoleKt;

public class Rect {
    private double w = 10.0D;
    private double h = 10.0D;
    public static int counter;

    public final double getW() {
        return this.w;
    }

    public final void setW(double var1) {
        this.w = var1;
    }

    public final double getH() {
        return this.h;
    }

    public final void setH(double var1) {
        this.h = var1;
    }

    private double per() {
        return (double)2 * this.w + (double)2 * this.h;
    }

    private double area() {
        return this.w * this.h;
    }

    public String toString() {
        return "размеры: " + this.w + " х " + this.h + ", периметр: " + this.per() + ", площадь: " + this.area();
    }

    public Rect(double w, double h) {
        this.w = w;
        this.h = h;
        Rect.counter++;
    }

    public Rect(double w) {
        this.w = w;
        Rect.counter++;
    }

    public Rect() {
        Rect.counter++;
    }

    public Rect(int w, int h) {
        this.w = w;
        this.h = h;
        Rect.counter++;
    }

    public Rect(int w) {
        this.w = w;
        Rect.counter++;
    }

    public Rect(float w, float h) {
        this.w = w;
        this.h = h;
        Rect.counter++;
    }

    public Rect(float w) {
        this.w = w;
        Rect.counter++;
    }

    public static boolean contains(Rect rect1, Rect rect2) {
        return rect1.getW() <= rect2.getW() && rect1.getH() <= rect2.getH();
    }

    public static Rect create(String text) {
        System.out.println(text);
        System.out.print("Введите длину прямоугольника: ");
        String w = ConsoleKt.readLine();
        System.out.print("Введите высоту прямоугольника: ");
        String h = ConsoleKt.readLine();

        assert w != null;
        assert h != null;
        return new Rect(Double.parseDouble(w), Double.parseDouble(h));
    }
}

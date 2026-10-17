package io.github.qboidev.ffc;

public class FPSInfinite {
    private static double fps;

    static void main() {
        while (true) {
            double start = System.currentTimeMillis();
            doStuff();
            double end = System.currentTimeMillis();
            fps = 1000.0 / (end - start);

            System.out.printf("%.01f : %s : %s%n", fps, start, end);
        }
    }

    private static void doStuff() {

    }
}

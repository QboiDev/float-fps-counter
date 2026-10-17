package io.github.qboidev.ffc;

public class FPSCorrect {
    private static double fps;

    static void main() {
        while (true) {
            double start = System.nanoTime();
            doStuff();
            double end = System.nanoTime();
            fps = 1000000000.0 / (end - start);

            System.out.printf("%.01f : %s : %s%n", fps, start, end);
        }
    }

    private static void doStuff() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}

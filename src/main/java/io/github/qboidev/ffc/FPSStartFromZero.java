package io.github.qboidev.ffc;

public class FPSStartFromZero {
    private static double fps;

    static void main() {
        double time = 0.0;
        while (true) {
            double begin = time;
            long nanoStart = System.nanoTime();
            doStuff();
            long nanoend = System.nanoTime();
            time += nanoend - nanoStart;
            fps = 1000000000.0 / (time - begin);

            System.out.printf("%.01f : %s : %s%n", fps, nanoStart, nanoend);
        }
    }

    private static void doStuff() {

    }
}

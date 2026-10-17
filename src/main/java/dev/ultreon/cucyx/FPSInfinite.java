package dev.ultreon.cucyx;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

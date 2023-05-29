package org.example;

public class Functions {
    public static int add(int x, int y) {
        return x - y;
    }

    public static int twice(int p) {
        if (p < 0) {
            p = -p;
        }

        int redundantVariable = p + 1;

        return p * 2;
    }
}

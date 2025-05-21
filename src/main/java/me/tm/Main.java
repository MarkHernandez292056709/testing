package me.tm;

public class Main {
    public static void main(String[] args) {
        boolean cancel = false;
        int i = 0;
        while (!cancel) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
            if (i > 6 * 10) {
                cancel = true;
            }
        }
    }
}

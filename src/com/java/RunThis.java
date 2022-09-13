package com.java;

public class RunThis implements Runnable {

    int a, b;

    @Override
    public void run() {
        for (int x = 0; x < 5; x++)
            synchronized (this) {
                a = 1;
                b = 2;
            }
        System.out.println("a" + a + "b" + b);
    }

    public static void main(String[] args) {
        RunThis runThis = new RunThis();
        Thread tr1 = new Thread(runThis);
        Thread tr2 = new Thread(runThis);
        tr1.start();
        tr2.start();
    }
}

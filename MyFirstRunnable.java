package com.home.multithread;

class Runnable1 implements Runnable {
    int i = 0;
    @Override
    public void run() {
        while(i < 20) {
            System.out.println("Thread name is : " + Thread.currentThread().getName()   +"  i:" + i);
            i++;
        }
    }
}
public class MyFirstRunnable{

    public static void main(String[] args) {
        Runnable1 runnable1 = new Runnable1();
        Thread t1 = new Thread(runnable1);
        t1.getName();
        t1.start();
        Thread t2 = new Thread(runnable1);
        t2.start();
    }
}

package JavaCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MultithreadingArray implements Runnable {

    Thread t;
    String threadName;
    List<Integer> a = new ArrayList<>();


    MultithreadingArray(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating thread name: " + this.threadName);
    }

    public void run() {
        System.out.println("Running thread name: " + threadName);

        synchronized (a) {
            for (Integer i = 0; i <= 4; i++) {
                System.out.println("Thread " + threadName + " " + i);
                if (!a.contains(i) || a.isEmpty()) {
                    a.add(i);
                }
            }
        }
    }

    public void start() {
        System.out.println("Starting thread " + threadName);
        if (t == null) {

            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String args[]) {

        MultithreadingArray obj1 = new MultithreadingArray("Thread1");
        obj1.start();

       // MultithreadingArray obj2 = new MultithreadingArray("Thread2");
        //obj2.start();

        System.out.println("Starting Print operation");
        for (Integer i :obj1.a ){
            System.out.println(i);
        }
    }

}




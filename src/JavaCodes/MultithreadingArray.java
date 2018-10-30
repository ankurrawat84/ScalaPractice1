package JavaCodes;

import java.util.ArrayList;



public class MultithreadingArray implements Runnable {

    Thread t;
    String threadName;
    static ArrayList<Integer> a = new ArrayList<>();


    MultithreadingArray(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating thread name: " + this.threadName);
    }

    public void run() {
        System.out.println("Running thread name: " + threadName);

        synchronized (a)
        {

            for (Integer i = 0; i <= 20; i++) {
                System.out.println("Thread " + threadName + " " + i);
                if (!a.contains(i)) {
//                    a.add(i);
                    try {
                        if (threadName == "Thread1") {Thread.sleep(10);a.add(i);}
                        else
                        {Thread.sleep(10);a.add(i);}
                        } catch (Exception e){
                        System.out.println(e.toString());
                    }

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

        MultithreadingArray obj2 = new MultithreadingArray("Thread2");
       obj2.start();

       try {
           obj2.t.join();
           obj1.t.join();

           System.out.println("\nStarting Print operation");
           for (Integer i : a ){
               System.out.println(i);
           }
       } catch (Exception e){
           System.out.println(e.toString());
        }
    }
}




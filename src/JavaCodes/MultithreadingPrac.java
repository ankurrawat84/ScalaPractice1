package JavaCodes;

public class MultithreadingPrac implements Runnable {

    Thread t;
    String threadName;


    MultithreadingPrac(String threadName){

        this.threadName = threadName;
        System.out.println("Creating thread name: " + this.threadName);
    }


    public void run(){
        System.out.println("Running thread name: "+ threadName);
        for (int i = 0; i<=4; i++){
            System.out.println("Thread "+ threadName + " " + i);
        }
    }

    public void start(){
        System.out.println("Starting thread " + threadName);
        if ( t == null){

            t = new Thread(this,threadName);
            t.start();
        }
    }

    public static void main (String args[]){

        MultithreadingPrac obj1 = new MultithreadingPrac("Thread1");
        obj1.start();

        MultithreadingPrac obj2 = new MultithreadingPrac("Thread2");
        obj2.start();

}


}

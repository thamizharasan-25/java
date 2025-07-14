//in this we gonna make two methods run simultaneusly using the threads

//class A extends Thread{ // to use class as a thread we use extends keyword
class A implements Runnable{  
public void run(){ //the methods should be run parallely so the start only call the run named method
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Batsman");
            try 
            {
                Thread.sleep(10);       // here we are keeping the thread in waiting state for 10m millisecond 
            } catch (InterruptedException e)
            { // it is a checked exception where it needs to handled 
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable {    //now while we call the two methods it runs parallel but not equally parallel or one after one it runs until the sheduler allows the thread
    public void run(){      // the sheduler only allows the multiple threads to access cpu to execute it so each thread has some time to execute after that other thread will execute
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Bowler");
            try 
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class Threads1 {
    public static void main(String[] args) {
        A obj1=new A();
        B objB=new B();
        ///obj1.setPriority(obj1.MAX_PRIORITY);// the prioritymethod  gives the priority to thread to execute in  the scdeuler
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(objB);

        t1.start();       // to call the method in thread we need to call as start
        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        

        t2.start();       //The aim to print 1 batsman and 1 bowler after and after..
    }
    
}

/* 
 Actually we cant control threads byy making it into millisecond but we can optimize them by keeping them in waiting state.

 WE CANT USE INHERITENCE WHEN WE USE THREAD WHERE IT IS A CLASS WE EXTENDS IT .SO V HAVE A ANOTHER OPTION CALLLED RUNNABLE(interface). 
 */
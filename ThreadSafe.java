// IN this we gonna see why we use synchronization keyword. if two threads are running nd using the same resource
// while using it may use the same value and do some collapse in it 

class Counter{
    int count=0;
    public synchronized void increment(){
        count++;
    }
}

public class ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Runnable obj1=()->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2=()->{
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();          // it is a checked exception so it needed to be handled
        t2.join();          
        System.out.println(c.count);    //255,589 this kind of output only occurs if we not join() bcoz the main method didn't wait until the thread finishes 
                                        //so it prints before itself without completion of the thread tasks
    }
    /// but after use of join also the count value will differ each time due to using of the method at a same time both threads to overcome this
    /// the method should be utilized by ine thread at a time.
    /// so we use synchronized keyword in the method where it allows one thread to access at a time 
    /// after usinf synchronized the output will be same
}

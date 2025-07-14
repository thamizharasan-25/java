///Runnable is a interface where the thread is implements it.so instead of using the thread we use the runnable and it can do inheritance 
/// Runnable is a functional interface where we can use lambda expressions by using anonymous class
/*class z{
    void show(){
        System.out.println("cricket");
    }
}
class A extends z implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("CSK");
            try 
            {
                Thread.sleep(10);       
            } catch (InterruptedException e)
            { // it is a checked exception where it needs to handled 
                e.printStackTrace();
            }
        }
        
    } 
    void display(){
       super.show();
   }
}
class B implements Runnable{
    public void run(){
    for (int i = 0; i < 10; i++) 
        {
            System.out.println("MI");
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
*/
//use lambda expressions by anonymous class
public class RunnableThread{
    public static void main(String[] args) {
        // Runnable obj1=new A();
        // Runnable obj2=new B();
        // A ob=new A();
        Runnable obj1=() ->{
            for (int i = 0; i < 10; i++) 
        {
            System.out.println("MI");
            try 
            {
                Thread.sleep(10);       
            } catch (InterruptedException e)
            {  
                e.printStackTrace();
            }
        }
        };
        Runnable obj2=() ->{for (int i = 0; i < 10; i++) 
        {
            System.out.println("CSK");
            try 
            {
                Thread.sleep(10);        
            } catch (InterruptedException e)
            { // it is a checked exception where it needs to handled 
                e.printStackTrace();
            }
        }};

        //instead of using thread we use interface here so we cant use start() method due to runnable has only run method so use the thread methods 
        //we need to create new thread and pass the runnable obj
        Thread t1=new Thread(obj1);
        Thread t2= new Thread(obj2);
        //ob.show();
        t1.start();
        t2.start();
    }
}

class A{
    public void display() throws ClassNotFoundException{
        Class.forName("tamil");//it is the inbuilt method which checks the class is present or not.
        // it is a checked exception where it should be handled anywhere .it shows error until it handles.
        // it can throw ClassNotFoundException. so here we are using throws to handle the exception where it has called instead of handling here.
    }
}
public class Throws {
    static{
        System.out.println("Class Loaded");  //it is a static method which is ececuted first in the class.
    }


    public static void main(String[] args) {
        A obj=new A();
      
         try {
            obj.display();      // here we are calling the method so now here this should be handled byu using try catch.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();// this will print the stack of the methods called the throws which we can find which mehtod caused exception. 
        } 
       
    }
}
/*
the throws keyword will throws the handling task to the whom the method is called.
it acts like the entire method is a critical statement and we handle the critical statement like we handling everytime.

 e.printStackTrace() it is used to find the which method is caused the exception where we used throws fro many methos inside the same class 
 or we used another method in the display method itself where we dont know which method caused exception..
 
 simply it prints the entire stack of which method is calling which method.
 */
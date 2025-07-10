class A{
    public A(){
        System.out.println("IN A");
    }
    public A(int n){
        System.out.println("In Int A");
    }
}
class B extends A{

 public B(){
                                    //super(); it is a method which execute the super class constructor first
        System.out.println("IN B"); //all constructor has super class implicitly
    }                               //when u call b() first execute the a() only
    public B(int n){
        this();//it executes the constructor of the same class
        System.out.println("In Int B");//thisd exectues B() then it calls A() then b() and last B(int n)
    }}
public class Thisandsuper {
    
    public static void main(String[] args) {
        
    B obj=new B(2);
    }
}


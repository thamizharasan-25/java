//Sealed class - it is used to restrict the classes which can inherit and which cant.
//it use Sealed keyword to specify it as sealed class and permits keyword it used to specify which class can access it or ih=ne=herit it
// it can be used in classes and interfaces
//if a cls extends a sealed cls then it should mention whether the cls should be sealed ,non sealed or final

interface matchinfo {
void match();
    
}
class cric{
    void show(){
        System.out.println("criccc");
    }
}
sealed class A extends cric implements matchinfo permits B,C{
    @Override
    public void match() {
        System.out.println("CSK VS MI");
    }
    void hit(){
        System.out.println("sixxx");
    }
    @Override
    void show(){
        System.out.println("A");
    }
    

}
non-sealed class B extends A{
    @Override
    void hit(){
        System.out.println("it's a four");
    }
    void out(){
        System.out.println("bowled");
    }
}
final class C extends A{ // class C cant be inherited by any class due to final
    @Override
    void hit(){
        System.out.println("it'ss a single");
    }

}
class D  extends B{ // if B should extended then it should be non sealed or sealed then it should permit which cls can access
    void hit(){
        System.out.println("it's a double");
    }
    void out(){
        System.out.println("it's a catch");
    }
    
}

//same we can use in interfaecs too
sealed interface Q permits W{
    void toss();
}
non-sealed interface W extends Q {
    void start();
    
}
class T implements W{

    @Override
    public void toss() {
        System.out.println("heads or tails");
       }

    @Override
    public void start() {
        System.out.println("Match starts at 30 mins after toss");
    }
    
}
public class SealedClass {
    public static void main(String[] args) {
        A a=new A();
        B b = new B();
        C c= new C();
        D d=new D();
        T t=new T();
        a.match();
        t.toss();
        t.start();
        a.hit();
        b.hit();
        b.out();
        c.hit();
        d.hit();
        d.out();
        

    }
    
}

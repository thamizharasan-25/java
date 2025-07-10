@FunctionalInterface //it gives error when the given interface mtd has two or more mtds.
interface A {
    void hit();
}

// class B implements A{
//     public void hit(){
//         System.out.println("Batsman hits a sixer");
//     }
// }
public class Func_interface {
    public static void main(String[] args) {
        // A obj=new B();
        // obj.hit();
        //another way we can do this by using anonymous inner cls for the interface obj
        A obj=new A() {
             public void hit(){
        System.out.println("Batsman hits a sixer");
            }
        };
        obj.hit();
    }
}

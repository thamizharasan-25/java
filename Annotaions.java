
    class A{
        public void show(){
            System.out.println("In A method");
        } 
    }
    class B extends A{
        @Override//it is the annotation which identifies any errors in overiding
        public void show(){
            System.out.println("In B method");
        }
    }
    public class Annotaions {
    public static void main(String[] args) {
        //A obj=new B();
        //A obj =new A();
        B obj=new B();
        obj.show();
    }
}

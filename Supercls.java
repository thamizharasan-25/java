class A{
    int age[];
    String name;
    A(int age[],String name){
        this.age=age;
        this.name=name;
    }    
    void getarr(){
        for (int i : age)
            System.out.print(i+" ");
        System.out.println();
    }
}
class B extends A{
    B(int age[],String name){
        super( age, name);
    }
    void get(){
        System.out.println("hiiii");
    }
}


public class Supercls {
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int arr2[]={6,7,2,8,4};
    B objB=new B(arr2, "tamil");
    A objA=new A(arr,"sakthi");

   // System.out.println(objB.age+" "+objB.name);
    //System.out.println(objA.age+" "+objA.name);
    objA.getarr();
    objB.getarr();
    A objc=new B(arr2, "tamil");
   // objc.getarr();
}
}

package C2Ctasks;
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void sleep(){
        System.out.println("sleeps");
    }
}
class bird extends Animal{
    @Override
    void eat(){
        System.out.println("bird eats");
    }
    @Override
    void sleep(){
        System.out.println("bird sleeps");
    }
    
    void fly(){
        System.out.println("fliess");
    }
}
public class Inherit1 {
    public static void main(String[] args) {
        Animal pig=new Animal();
       //Animal penguin=new bird();//it takes animal as the reference type so where the method fly is not present in the animal so it gives an error 
        bird crow=new bird();
        pig.eat();;
        pig.sleep();
        crow.eat();
        crow.sleep();
        crow.fly();
        //penguin.sleep();
    }
}

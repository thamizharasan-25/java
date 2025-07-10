@FunctionalInterface //it gives error when the given interface mtd has two or more mtds.
interface A {
    void hit(int x);
}
interface B{
    int runs(int i,int j);
}
public class Lambda_exp1 {
    public static void main(String[] args) {
        // using anonymous inner cls for the interface obj
        // A obj=new A(){
        //      public void hit(){
        // System.out.println("Batsman hits a sixer");
        //     }
        // };
        //In functional interface we can use the lambda expression which reduces the code and simplifies it;
        // A obj=() ->System.out.println("Batsman hits a sixer");     //if more print statements we use {};
        //if there is a parameter passing in the method,no need to mention type of paramter
        // and if it is only one paramter no need of ()
        //  -> == lambda expression
        A obj= x ->System.out.println("Batsman hits a sixer and indiviual score:"+x); 
        obj.hit(15);

        //we can use it on return methods

        // B obj1=new B() {
        //     public int runs(int i,int j){
        //         return i+j;
        //     }
        // };

        //we can reduce the lines by the use of lambda expression
        // we cant use return in single in this expression if we want to use need to put{}; 
        B obj1=(i, j)->i+j;
        
        int result=obj1.runs(45,20);
        System.out.println("Total runs scored by the team:"+result);

    }
}
//if we compile this we get A and B class where these are interfaces and if we use innerclass it creates another file so lamba exp reduces the files creating .



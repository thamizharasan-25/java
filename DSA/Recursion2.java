package DSA;

public class Recursion2 {
    //parametrized way
    public static void SumofN(int i,int sum){
       if(i<1){
        System.out.println(sum);
        return ;
       }
       else 
       sum=sum+i;
       SumofN(i-1, sum);
        
    }
    //Functional Recursion
    public static int SumofN2(int n){
       if(n==0){
        return 0;
       }
       else 
       return n+SumofN2(n-1);
        
    }
    // factorial using function recursion
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        return n*fact(n-1);

    }

    public static void main(String[] args) {
        //System.out.println(SumofN(5,5));
        SumofN(5, 0);
        int sum=SumofN2(5);
        System.out.println(sum);
        //factorial 
        int factorial=fact(5);
        System.out.println("factorial : "+ factorial);
    }
}

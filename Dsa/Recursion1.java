//print name n times
package Dsa;                            
public class Recursion1 {
    public static void recur1(int count,int n,String name ){
         
        System.out.println(name);
        if(count==n) return ;// in void we cant return any value but we can use return to stop the recursion.
        recur1(count+1,n, name);
         
}
//print 1 to n
    public static void recur2(int c,int n){
        if(c>n) return;
        System.out.println(c);
        recur2(c+1, n);
    }
// print n to 1
    public static void recur3(int c,int n){
        if(c<1) return;
        System.out.println(c);
        recur3(c-1, n);
    }
//print 1 to N by backtraking => it means the print should be after the function call
    public static void recur4(int c,int n){
        if(c<1) return;
        recur4(c-1, n);
        //here we printing the c after the recursion ends where only prints  if the specified conditon get
        System.out.println(c);
    }
//print N to 1 by backtraking => it means the print should be after the function call
    public static void recur5(int c,int n){
        if(c>n) return;
        recur5(c+1, n);
        System.out.println(c);
       
        //here we printing the c after the recursion ends where only prints  if the specified conditon get
        
    }
public static void main(String[] args) {
    int n=5;
   String name="Tamil";
    System.out.println("print name n times");
    recur1(1,n, name);
    System.out.println("--1 to N--");
    recur2(1,n);
    System.out.println("--N to 1--");
    recur3(n, n);
    System.out.println("--1 to N backtracking--");
    recur4(n, n);
    System.out.println("--N to 1 backtracking--");
    recur5(1, n);
}

}

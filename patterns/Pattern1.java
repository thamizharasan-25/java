package patterns;
public class Pattern1 {
public static void print1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void print2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void print3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    } 
public static void print4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    } 
public static void print5(int n){
        for (int i = 1; i <=n; i++) {
            for (int j =1 ; j <= n-i+1; j++) {//if we start from 0 then we can use n-i;
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
public static void print6(int n){
        for (int i = 1; i <=n; i++) {
            for (int j =1 ; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    } 
public static void print7(int n){
        for (int i = 0; i <n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {//for j=1 formula use <=n-i-1 or < n-i;
                System.out.print(" ");
            }
            //stars
            for (int j =0 ; j <2*i+1; j++) {//for j=1 formula use 2*i-1 or <= 2*i +1
                System.out.print("*");
            }
            //spaces
             for (int j = 0; j < n-i-1; j++) {//for j=1 formula use <=n-i-1 or < n-i;
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
public static void print8(int n){
    //int c=2*n-1;
        System.out.println();
        for (int i = 0; i <n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j =0 ; j <(2*n)-(2*i+1); j++) {//before we use from 1 to 9 2*+1 now we 9 to 1 so we reduced that from 2*n
                System.out.print("*");
            }
            //spaces
             for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
            //c=c-2;
            //j<2*n-1-(2*i)
        }
    } 
public static void print9(int n){
    //combination of two patterns
        for (int i = 0; i <n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {//for j=1 formula use <=n-i-1 or < n-i;
                System.out.print(" ");
            }
            //stars
            for (int j =0 ; j <2*i+1; j++) {//for j=1 formula use 2*i-1 or <= 2*i +1
                System.out.print("*");
            }
            //spaces
             for (int j = 0; j < n-i-1; j++) {//for j=1 formula use <=n-i-1 or < n-i;
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i <n; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j =0 ; j <(2*n)-(2*i+1); j++) {//before we use from 1 to 9 2*+1 now we 9 to 1 so we reduced that from 2*n
                System.out.print("*");
            }
            //spaces
             for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
            //c=c-2;
            //j<2*n-1-(2*i)
        }
    } 
public static void print10(int n){ 
    for (int i = 1; i <=2*n-1; i++) {
        int star=i>5?2*n-i:i;
        //if(i>=5) star=2*n-i;
        for (int j = 1; j <=star ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void print11(int n){ 
    int st=1;
    for (int i = 0; i <n; i++) {
        for (int j = 0; j <=i ; j++) {
            System.out.print(st+" ");
            st=(st==1)?0:1;
        }   //we can use this method also where it is easy to understand..
        System.out.println();
    }
    /* 
    we can do another method by calculating the rows number if odd row then st=1 and if even it start as 0
    for (int i = 0; i <n; i++) {

        if(i%2==0) st=1;         //rows 0,1,2,are even rows which start with zero 
        else st=0;
        for (int j = 0; j <=i ; j++) {
            System.out.print(st+" ");
            st=1-st;            //it flips from 0 to 1 if st=1 then 1-1 =0 else 0 then 1-0 =1
        }
        System.out.println();
    }
     */
}
public static void print12(int n){
    int space=2*(n-1); //2*n-2
    for (int i = 1; i <= n; i++) {
        //number
        for (int j = 1; j <=i ; j++) {
            System.out.print(j+" ");
        }
        //spaces
        for (int j = 1; j <=space ; j++) {
            System.out.print("  ");
        }
        //reverse the number
        for (int j = i; j >=1 ; j--) {
            System.out.print(j+" ");
        }
        System.out.println();
        space-=2;
    }
}  
public static void print13(int n){
    int k=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    } 
public static void print14(int n){
        for (int i = 1; i <=n; i++) {
            //char ch='A';
            //for (int j=1;j<=i;j++) {
            //System.out.print(ch++);
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    } 
public static void print15(int n){
        for (int i = 0; i <n; i++) {
            //for (int i=n;j>=n;i--) {
                //for(char ch='A';ch<'A'+n;ch++)
            for(char ch='A';ch<'A'+ (n-i);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    } 
public static void print16(int n){
        //char ch='A';
        for (int i = 0; i <n; i++) {
            char ch=(char) ('A' + i);
            //for (int i=n;j>=n;i--) {
                //for(char ch='A';ch<'A'+n;ch++)
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
           // ch++;
        }
    } 
public static void print17(int n){
        for (int i = 0; i <n; i++) {
            //space
            for (int j = 0; j <=n-i-1 ; j++) {
                System.out.print(" ");
            }
            //char
                char ch='A';
                //int breakpoint=((2*i)+1)/2;
            for (int j = 0; j <(2*i)+1; j++) {
                System.out.print(ch);
                //if(j<breakpoint) 
                if(j<i) ch+=1;
                else  ch-=1;
            }
            //spaces
             for (int j = 0; j <=n-i-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
public static void print18(int n){
   // for (int i = 1; i <=n; i++) {  //thw commented statements also can be used for this pattern
      for (int i = 0; i <n; i++) {  
        // for(char ch=(char)('A'+n-i);ch<='A'+n-1;ch++){
        for (char ch = (char)('E'-i); ch <= 'E'; ch++) { //in c++ we no need of type casting for ch
            System.out.print(ch);
        }
        System.out.println();
    }
}
public static void print19(int n){
    int space=0;
        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j <space ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space+=2;
        }
        space-=2;
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j <space ; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            space-=2;
            System.out.println();
            
        }
            

        
    } 
public static void print20(int n){
    int space=n*2-2; 
    for (int i = 1; i <=2*n-1; i++) {
        int star=i>n?(2*n)-i:i;
        //if(i>=n) star=2*n-i;
        //star
        for (int j = 1; j <=star ; j++) {
            System.out.print("*");
        }
        //space
        for (int j = 0; j < space; j++) {
            System.out.print(" ");
        }
        //star
        for (int j = 1; j <=star ; j++) {
            System.out.print("*");
        }
        if(i>=n) space+=2;
        else space-=2;
        System.out.println();
    }
}
public static void print21(int n){
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if(i==0 || i==n-1 || j==0 || j==n-1){
                System.out.print("*");
            }else System.out.print(" ");
        }
        System.out.println();
    }
}
public static void print22(int n){
    for (int i = 0; i < 2*n-1; i++) {
        for (int j = 0; j <2*n-1; j++) {
            //here we find minimum distance from the all sides and subracting it with the n value to get this pattern
            int top=i;
            int left=j;
            int right=(2*n-2)-j;
            int bottom=(2*n-2)-i;
            
            System.out.print( n-Math.min(Math.min(top,bottom),Math.min(left,right))+" ");
        }
    System.out.println();
}
}
public static void main(String[] args) {
    int n=5;
    print1(n);
    System.out.println();
    print2(n);
    System.out.println();
    print3(n);
    System.out.println();
    print4(n);
    System.out.println();
    print5(n);
    System.out.println();
    print6(n);
    System.out.println();
    print7(n);
    System.out.println();
    print8(n);
    System.out.println();
    print9(n);
    System.out.println();
    print10(n);
    System.out.println();
    print11(n);
    System.out.println();
    print12(n);
    System.out.println();
    print13(n);
    System.out.println();
    print14(n);
    System.out.println();
    print15(n);
    System.out.println();
    print16(n);
    System.out.println();
    print17(n);
    System.out.println();
    print18(n);
    System.out.println();
    print19(n);
    System.out.println();
    print20(n);
    System.out.println();
    print21(n);
    System.out.println();
    print22(n);
}
}


public class FindGCD {
    public static int GCD(int a,int b){  //it is an optimal approach where it uses Equilateral algorithm where if(a>b)the gcb(a,b)=gcd(a-b,b)
        while(a>0 && b>0){                  //I changed a bit which reduce the loop where if(a>b) then gcd(a,b)=(a%b,b) 
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;              //Time Complexity :O(log pie(min(a,b))
        return a;
    }
    public static void main(String[] args) {
        int a=13;
        int b=5;
        System.out.println(GCD(a,b));
        //optimal of brute force mtd
        for (int i = a<b?a:b; i >=1; i--) {  //its worst case is O(min(a,b)) 
            if(a%i==0 && b%i==0){
                    System.out.println("The GCD of "+a+" and "+b+" is :"+i);
                } 
        }
    }
}

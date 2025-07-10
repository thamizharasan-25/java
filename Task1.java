import java.util.Scanner;
public class Task1 {
        
    public static void main(String[] args) {
        int num,a;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        int c=0;
        int arr[]=new int[10];

        while(num>0){
           a=num%10;
            arr[a]+=1;
            num/=10;
         }
        for(int i=0;i<10;i++){
                if (arr[i]>1) {
                    c+=1;
                }
        }
        if (c>0) {
            System.out.println("the security key is "+ c);
        }else
            System.out.println(-1);
        

    }
}
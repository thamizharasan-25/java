import java.util.Scanner;
public class Level2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        int opt=sc.nextInt();
        
        if(n==0 || n==1){
            System.out.println("1");
        }
        if (opt==1 || opt==2) {
             int res=0;
            if (opt==1)
         {
           
        for ( int i = 0; i <n; i++) {
             int current=n-i;//5-0,5-1,5-2,...
            res= (i%2==0) ?(res+=current):(res-=current);//n -(n-1) + (n-2) - ...
        }//checks even to add and else it subs
          }else if(opt==2){
            for ( int i = 0; i <n; i++) {
             int current=n-i;//current =5-0,5-1,5-2,...
             res= (i%2==1 || i==0) ?(res+=current):(res-=current);//+n +n-1 -(n-2)+...
             }//checks odd and i==0 to add 
            }
    System.out.println(res);
    sc.close();
        }else
     System.out.println("Invalid option");
}

}
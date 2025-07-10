import java.util.Scanner;

public class Smartsensor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for (int j = 0; j < n; j++) {
            arr[j]=sc.nextInt();
        }
        int mode=sc.nextInt();
        
            for (int j =0 ; j < n; j++) {
                if(j>=2){
                int count=0;
                    for (int k =2 ; k <= j/2; k++) {
                        if(j%k==0){
                            count+=1;
                            break;
                        }
                    }
                    if(count==0 && mode==1 ) sum+=arr[j];
                    if(count>0 && mode==2) sum+=arr[j];
                    }else if(mode==2 )sum+=arr[j];      
               System.out.println(sum);          
                }
                  sc.close();
    }
    }
           
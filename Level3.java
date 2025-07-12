import java.util.Scanner;

public class Level3 {
    public static boolean isstable(int num){
        int ind[]=new int[10];
        while (num>0) {
            ind[num%10]+=1;
            num/=10;
            
        }
        int c=0;
        for (int i : ind) {
            if(i>0){
                if(c==0)
                    c=i;
                else if(i!=c)
                    return false;
            }
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        int max=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
            int temp=arr[i];
            if(isstable(temp) && temp>max){
                max=temp;
            }else if(isstable(temp)==false && min>temp){
                min=temp;
            }
        }
        if(min==Integer.MAX_VALUE) min=0;
        //System.out.println(max +" "+min);
         System.out.println(max-min);
         sc.close();
        }
    }

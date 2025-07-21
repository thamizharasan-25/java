import java.util.Scanner;

public class Arraytsk1 {
    public void checknum(int arr[],int z){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length-1; j++) {
            //System.out.println(arr[j]+arr[j+1]);
            if((arr[i]+arr[j+1])==z){
                System.out.println(arr[i]+" "+arr[j+1]);
                c++;
            }
        }
        if(c==0) System.out.println("No addition of values matches given number");
    }
    }
    public static void main(String[] args) {
        Arraytsk1 ar=new Arraytsk1();
        
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the n value:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter the elements:");
    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
    }
    System.out.print("enter the z value:");
    int z=sc.nextInt();
    sc.close();
    ar.checknum(arr, z);
    
}
}


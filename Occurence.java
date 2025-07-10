import java.util.Scanner;

public class Occurence {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n value:");
    int n =sc.nextInt();
    int arr[]=new int[n];
    int freq[]=new int[100];
    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
        freq[arr[i]]+=1;
    }
    for (int j=0;j<100;j++) {
        if(freq[j]>1)
            System.out.println(j+" - "+freq[j]+" Occurences");
        if(freq[j]==1)
            System.out.println(j+" - "+freq[j]+" Occurence");
        }
    sc.close();
}
    }

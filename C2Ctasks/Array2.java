package C2Ctasks;

public class Array2 {
    public static void main(String[] args) {
        int arr[]={1,2,5,8,4,7,15,5};
  
        int max=0;
        int min=Integer.MAX_VALUE;
        for (int i : arr) {
            max=i>max?i:max;
            min=i<min?i:min;
        }
        System.out.println("Max :"+max+" Min : "+min);
    }
}

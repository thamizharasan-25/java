public class aa1 {
    public static void main(String str[]){
        int a[]={1,2,3,8,4,6,5};
        int f=3;
        int min=f;
        for(int i=0;i<a.length;i++){
            if(a[i]>f){
                if(min==f || min>a[i]){
                    min=a[i];
                }
            }

        }
        System.out.println(min);

        
    }
    
}

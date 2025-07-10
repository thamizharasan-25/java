public class bin_power {
    //we use bit multiplication 
    public static double power(double x,int n ){
        long m=n;
        if (m<0) {
            x=1/x;
            m=-m;
        }
        double res=1.0;
        while (m>0) {
            if(m%2==1){//when the bit is 1 we multiply with the x until then we exponent the power
                res*=x;
            }
            x*=x;
            m/=2;
        }
        return res;
    }
    public static void main(String[] args) {
        double x=5;
        int n=5;
        System.out.println(power(x, n));
    }
}

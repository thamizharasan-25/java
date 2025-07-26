
// check the string is palindrome using recursion

public class Recursion4 {
    public static boolean isPalindrome(String str,int l,int n){
        if(l>=n/2) return true;
        if(str.charAt(l)!=str.charAt(n-l-1)) return false;
        return isPalindrome(str, l+1, n);
    }
    public static void main(String[] args) {
        String str="maddak";
        int l=0;
        int n=str.length();
        if(isPalindrome(str, l, n)) System.out.println("it is palindrome");
       // else System.out.println("Not a palindrome");
    }
}

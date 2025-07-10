public class str {
    public static void main(String[] args) {
        String s="A B C";
        int co=0;
        for (char c : s.toCharArray()) {
            if(c!=' '){
                s=s+c;
                co++;
            }
        }
        System.out.println(s.substring(s.length()-co,s.length()));


    }

}

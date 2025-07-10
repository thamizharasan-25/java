public class Stringbuff {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("tamil");
        String name=sb.toString();// it converts into string
        sb.append("Arasan");
        System.out.println(sb);
        sb.capacity();//default capacity is 16 if we use any values inside it idd adds to 16+
        sb.ensureCapacity(30);//min capacity for the buffer
        sb.insert(3,name);//insert into the stringbuffer
        sb.deleteCharAt(4);//delets the char at index position


    }
}

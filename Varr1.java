import java.util.*;

class Student{
    int id;
    String name;
    Student(int i,String n){
        id=i;
        name=n;
    }
}
public class Varr1 {
    //it can be used for local variables 
    public static void main(String[] args) {
        //var nums=new int[5]; used as datatype in array and all primitivr types
        //var b=1; it takes as int
        // var s4=new ArrayList1(); 
    ArrayList<Student> l=new ArrayList<>();
    var s1=new Student(1,"Bala");  //used for reference type
    Student s2=new Student(2,"Sakthi");
    Student s3=new Student(3,"Thamil");
    l.add(s1);
    l.add(s2);
    l.add(s3);
    for (Student o :l) {
        System.out.println(o.id+" "+o.name);
    }
    
}   
    
}

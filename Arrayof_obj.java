 class Student{
        int marks;
        String name;
    }
public class Arrayof_obj {
   
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student();
        Student s3= new Student();
        s1.name="Tamil";
        s1.marks=90;
        s2.name="Ajay";
        s2.marks=95;
        s3.name="Arasan";
        s3.marks=97;
        Student students[]=new Student[3];//creating a obj array for the Student class
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        // for (int i = 0; i < students.length; i++) 
        //     System.out.println(students[i].name + " : "+students[i].marks );
        for (Student stu : students) {//so only we used the Student instead of int or string
            System.out.println(stu.name+" : "+stu.marks);//if we want to access the obj array so we need to mention the return type as classname
            
        }
        
        
    }
}

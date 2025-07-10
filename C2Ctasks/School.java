package C2Ctasks;

 class Person {
    private String name;
    private String DOB;
    Person(String name)
    {
     this.name=name;
    }  
  Person(String name,String DOB){
        this.name=name;
        this.DOB=DOB;
    }
    public String getname(){
        return name; 
    }
    public String getDOB(){
        return DOB; 
    }
    public void setname(String name){
        this.name=name;
    }
    public void setDOB(String DOB){
        this.DOB=DOB;
    }
}



class Teacher extends Person{
    private String subject;
    private int salary;
    Teacher(String name,String DOB,String subject,int salary){
        super(name, DOB);
        this.salary=salary;
        this.subject=subject;
    }
    //setters
    public void setsalary(int salary){
        this.salary=salary;
    }
    public void setsubject(String subject){
        this.subject=subject;
    }
    //gettters
    public int getsalary(){
        return salary;
    }
    public String getsubject(){
        return subject;
    }
    public void Teacherdetails(){
        System.out.println("Name: "+getname());
        System.out.println("DOB : "+getDOB());
        System.out.println("Subject :"+getsubject());
        System.out.println("Salary :"+getsalary());
    }
    
}



 class Student extends Person {
    private int stuid;
    Student(String name,String DOB,int stuid){
        super(name, DOB);
        this.stuid=stuid;
    }
    //getter
    public int getstuid(){
        return stuid;
    }
    //Setter
    public void setsalary(int stuid){
        this.stuid=stuid;
    }

    public void StudentDetails(){
        
        System.out.println("Name: "+getname());
        System.out.println("DOB : "+getDOB());
        System.out.println("Student id :"+getstuid());
    }
}


class CollegeStudent extends Student{
    private String collegeName;
    private String year;
    CollegeStudent(String name,String DOB,int stuid,String collegeName,String year){
        super(name,DOB,stuid);
        this.collegeName=collegeName;
        this.year=year;
    }
    public String getscollegeName(){
        return collegeName;
    }
    public String getyear(){
        return year;
    }
    public void setcollegeName(String collegeName){
        this.collegeName=collegeName;
    }
    public void setyear(String year){
        this.year=year;
    }
    public void CollegeStudentDetails(){
        super.StudentDetails();
        System.out.println("College Name : "+getscollegeName());
        System.out.println("Year :"+getyear());
    }

}
public class School{
public static void main(String[] args) {
    System.out.println("------TEACHER DETAILS------");
    Teacher T=new Teacher("Thamizharasan", "15 10 2004", "JAVA", 50000);
    T.Teacherdetails();
    System.out.println("-------STUDENT DETAILS-------");
    Student S=new Student("Thamizharasan", "15 10 2004", 1001);
    S.StudentDetails();
    System.out.println("//////COLLEGE STUDENT DETAILS////////");
    CollegeStudent CS=new CollegeStudent("Ajay", "10 10 2004", 1002, "KNCET", "4th");
    CS.CollegeStudentDetails();
}
    
}

package C2Ctasks;

public class Employee extends Person{
    
    private double salary;
    private int year;
    private String insurance;
     Employee(double salary,int year,String insurance,String name){
        super(name);
        this.salary=salary;
        this.insurance=insurance;
        this.year=year;
        
    }
    //GETTERS
    public void setsalary(double salary){
        this.salary=salary;
    }
    public void setyear(int year){
        this.year=year;
    }
    public void set_insurancenumber(String insurance){
        this.insurance=insurance;        
    }
    //SETTERS
    public double getsalary(){
        return salary;
    }
    public String getinsurance(){
        return insurance;
    }
    public int getyear(){
        return year;
    }
     
    public void empdetails(){
        System.out.println("Name : "+getname());// or use super.name if it's protected
        System.out.println("Salary : "+salary);
        System.out.println("Insurance No  : "+insurance);
        System.out.println("Year started : "+year);
    }

}

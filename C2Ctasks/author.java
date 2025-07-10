package C2Ctasks;
//Encapsulation / Abstraction
 public class author{
    private String name;
    private String email;
    private char gender;
    author(String name,String email,char gender){
        this.email=email;
        this.name=name;
        this.gender=gender;
    }
     public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public  String display(){
       return "Name : "+name +" Email : "+email+" Gender : "+gender;
    }
}


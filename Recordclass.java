/*
the record class are used where we use the classs for only storing of data .so instead of writing these data 
we use record which cosist of these codes
class TWS{
    private final int id;
    private final String model_name;
    public int getId() {
        return id;
    }
    public String getModel_name() {
        return model_name;
    }
    public TWS(int id, String model_name) {
        this.id = id;
        this.model_name = model_name;
    }
    @Override
    public String toString() {
        return "TWS [id=" + id + ", model_name=" + model_name + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((model_name == null) ? 0 : model_name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TWS other = (TWS) obj;
        if (id != other.id)
            return false;
        if (model_name == null) {
            if (other.model_name != null)
                return false;
        } else if (!model_name.equals(other.model_name))
            return false;
        return true;
    }
}
    uncomment and check with record output which gives the same output where in record class have this code in it
    In record all variables are private final where we cant change it after initiating
 */  

record TWS(int id,String model_name) { 
    //we can use condition to the constructor too
    public TWS{
    if(id==0){
      throw new IllegalArgumentException("id cannot be zero");
    }
    //we can create default constructor where we pass 0 to id and "empty string" to name due to final variables
    // where it is not a best to use wher ewe use record to store the data so we use constructor
}
}

public class Recordclass {
public static void main(String[] args) {
    TWS t1=new TWS(1,"boult");
    TWS t2=new TWS(2,"boat");
    System.out.println(t1.equals(t2)); //if we didnt use the equals in the class it check the reference of the variable not values
    System.out.println(t1.model_name()); //getter method will be name in the variable name
    System.out.println(t2);
    System.out.println(t1);
}
}

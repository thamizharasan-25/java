public class Enum2 {
    enum days{
        monday,tuesday,wednesday,thrusday,friday,saturday,sunday;
        //here we gonna use switch and if else to print the menu of the night hostel food
    }
    public static void main(String[] args) {
        days d=days.monday;
        //switch 
        // in switch we can give the constants in the cases
        switch (d) {
            case monday:
                System.out.println("Dosa and TomatoRice");
                break;
            case tuesday:
                System.out.println("Dosa and egg");
                break;
            case wednesday:
                System.out.println("Chicken and parotta");
                break;
            case thrusday:
                System.out.println("Idly");
                break;
            case friday:
                System.out.println("bread and jam with rice");
                break;
            case saturday:
                System.out.println("ragi dosa");
                break; 
            case sunday:
                System.out.println("Chicken biriyani");
                break;
        
            default:
                System.out.println("enter the correct day!!");
                break;
        }

        //if condition
        // if (d==days.monday) {
        //     System.out.println("Dosa and TomatoRice");
        // }else if(d==d.tuesday)System.out.println("Dosa and egg");
        // else System.out.println("use if else like this in enum");

    }
}

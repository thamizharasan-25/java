public class Enum3 {
    enum bats{
        //here we using constructors for the each brand name using prices
        MRF(17000),CEAT(15000),SG(15700),DSC;//DSC has no constructor so we need to create default constructor to avoid error
        private int price;
        bats(int price){
            this.price=price;//here each bat acts as a objects 
        }
        bats(){
            price=13000;//this acts as a minimum price for the bats
        }

    }
    public static void main(String[] args) {
        for (bats b: bats.values()){//values gives all the constant as an arrays
            System.out.println(b+" price : "+b.price);
        }

        }
}

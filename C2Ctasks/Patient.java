    package C2Ctasks;

    class Name{
        private String patientname;
        private double height;
        private double weight;
        public double computeBMI(String name,double h,double w){
            patientname=name;
            height=h/100;
            weight=w;
            System.out.println(patientname);
            double BMI =weight/(height*height);
            return BMI;

        }
    }

    public class Patient{
        public static void main(String[] args) {
            Name T=new Name();
            System.out.println(Math.round(T.computeBMI("tamilarasan", 165, 68)));
        }
    }

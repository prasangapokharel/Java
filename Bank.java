// public class interface {
    interface Bank {
        float rateOfInterest();
    }
    class NIC implements Bank{
        public float rateOfInterest(){
            return 9.14f;
        }
    }
    class Sanima implements Bank {
        public float rateOfInterest(){
            return 9.7f;
        }
    }
    class TestInterface2{
        public static void main(String[] args){
            Bank b=new Sanima();
            System.out.println("ROI: "+b.rateOfInterest());
        }
    }
// }

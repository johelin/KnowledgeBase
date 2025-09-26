public class Intereface {
    public interface isItZero {
    void checkZero(String sugar);
        
    }

    public class ZeroCheck implements isItZero{ 
        //@Override // override the method from the interface - dont need the override annotation but good practice to use it
        @Override
        public void checkZero(String sugar) {
            if (sugar.equals("zero")) {
                System.out.println("The item is zero.");
            } else if(sugar.equals("diet")){
                System.out.println("The item is diet.");
            }else{
                System.out.println("The item is not normal coke.");
            }
        }
    }
    public static void main(String[] args) {
        Intereface intereface = new Intereface(); // new object which will then use isItZero interface
        isItZero sugerCheck = intereface.new ZeroCheck(); // new object which will then use ZeroCheck class
        sugerCheck.checkZero("zero"); // call the method from the interface
    }
}

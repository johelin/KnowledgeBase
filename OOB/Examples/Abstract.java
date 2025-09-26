abstract class Abstract {
    public void coffee(int beans){
        if(beans == 1){
            System.out.println("your coffee is weak");
        }
        else if(beans == 2){
            System.out.println("your coffee is medium");
        }
        else if(beans == 3){
            System.out.println("your coffee is strong");
        }
        else{
            System.out.println("no coffee");
        }
    }

    public abstract void milk();
}

class Latte extends Abstract{
    boolean milk = true;

    @Override
    public void milk() {
        if(milk){
            System.out.println("coffee has milk - This is a latte");
        } else{
        System.out.println("medium weak coffee");
    }
}
public static void main(String[] args) {
    Abstract myCoffe = new Latte();
    myCoffe.coffee(2);
    myCoffe.milk();
}
}

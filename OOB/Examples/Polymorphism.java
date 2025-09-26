public class Polymorphism {
    public void name(){
        System.out.println("Elin");
    }

    public void name(String lastname){
        System.out.println(lastname);
    }


public static void main(String[] args) {
    Polymorphism obj = new Polymorphism();
    obj.name();
    obj.name("Johansson");

}}
//polymorphism = many forms of the same method
public class Encapsulation{
    private String name;
    private int age;
//encapsulation with getter and setter
    public String getName(){ 
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
}
public static void main(String[] args){ //main method
    Encapsulation person = new Encapsulation(); //creating the object
    person.setName("Elin"); // setting the name
    person.setAge(25); // setting the age
    System.out.println("Name: " + person.getName()); //getting the name
    System.out.println("Age: " + person.getAge()); //getting the age
}}

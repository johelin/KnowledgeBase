import java.util.*;

public class linkyList{
    public static void main(String[] args) {
LinkedList letters = new LinkedList();
letters.add("A");
System.out.println(letters);
letters.add("B");
System.out.println(letters);
letters.add("C");
System.out.println(letters);
letters.add("C");
System.out.println(letters);
letters.add("A");
System.out.println(letters);
letters.remove("C");
System.out.println(letters); //removes first occurrence of C

}}
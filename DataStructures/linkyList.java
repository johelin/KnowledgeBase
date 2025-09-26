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

// can be accessed in O(n) time
//LinkedList<Datatype> letters = new LinkedList<>();
// Train example: each node is a wagon, each wagon has a pointer to the next wagon
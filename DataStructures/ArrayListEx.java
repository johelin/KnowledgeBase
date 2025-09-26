import java.util.*;

public class ArrayListEx {   
    static int count = 0;

public static void main(String[] args) {
    ArrayList letters = new ArrayList();
    letters.add("A"); // add element to the end of the list
    System.out.println(letters);
    letters.add("B");
    System.out.println(letters);
    letters.add("C");
    System.out.println(letters);
    letters.add("C");
    System.out.println(letters);
    letters.remove("C"); //removes first occurrence of C
    System.out.println(letters); 
    letters.add("A");
    System.out.println(letters); 
    letters.add("A");
    System.out.println(letters);
    letters.remove("A");
    System.out.println(letters); //will remove the first instance of A.
    letters.addFirst("D"); // adds D to the start of the list
    System.out.println(letters);
    letters.add(2, "Q");  // adds E at index 2
    System.out.println(letters);

    for(int i = 0; i < letters.size(); i++){
        if(letters.get(i) == "A"){
            count = count + 1;
        }
    }
    System.out.println(count);
}}


// can be accessed in O(1) time
// can pick value at random
// premade functions: add, remove, size, get, set, clear, isEmpty, contains, indexOf, lastIndexOf, toArray
// resizing array is expensive O(n) time complexity, hence it will take longer time to add elements when the array is full

// basic array is structured as int[] arr = new int[10]; // fixed size
// ArrayList is structured as ArrayList<Integer> arr = new ArrayList<>(); // dynamic
// need to import java.util.ArrayList; to use ArrayList
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> letters = new HashSet<>();
        letters.add("A");
        System.out.println(letters);
        letters.add("B");
        System.out.println(letters);
        letters.add("C");
        System.out.println(letters);

        Iterator<String> it = letters.iterator();
        while(it.hasNext()){
            System.out.println(it.next());  
    }
}}
//O(1) time complexity for add, remove, contains
// HasSet visually looks like a list but is actually a hash table
//visually used to check if an item is in a collection
//if you wanna do fasyr lookups use HashSet
// fastest o(1) for adding and removing
// store unique elements only
//order of elements is not guaranteed
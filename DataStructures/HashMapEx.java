import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> user = new HashMap<>();
        user.put("Elin", "Broadcast Engineer");
        user.put("Alice", "Software Developer");
        user.put("Lawrence", "Project Engineer");
        System.out.println(user);
    
        System.out.println(user.get("Elin"));
        System.out.println(user.replace("Elin", "Laid Off"));
        System.out.println(user);
        
    }
}


//list of key and values
//mail box room example: box number and place in wall
//HashMap<KeyDatatype, ValueDatatype> map = new HashMap<>();
//HashMap<String, Integer> map = new HashMap<>();
//premade functions: put, get, remove, containsKey, con vbainsValue, size,
//example use for getting all information of users etc. 
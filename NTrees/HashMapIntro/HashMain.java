package NTrees.HashMapIntro;

import java.util.HashMap;

public class HashMain {
    public static void main(String[] args) {

        // It is just a key value pair map
        // The key type and value type:
        // 1. Must have Classes like: String, Integer, Float
        // 2. Primitives type are not allowed

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Hello", 1);
        hm.put("World", 9);
        hm.put("Hfewf", 5);
        hm.put("efwfewf", 3);

        System.out.println(hm);

        System.out.println(hm.get("Hello"));

        System.out.println(hm.containsKey("World"));

        System.out.println(hm.containsValue(0));

        hm.replace("World", 121);
        System.out.println(hm);

    }
}

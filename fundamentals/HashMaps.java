package fundamentals;

import java.util.HashMap;

public class HashMaps {
    public static void main (String[] args){
        HashMap<String,Integer> dict = new HashMap<>();
        dict.put("Mustang",1200);
        dict.put("Ferrari",1200);
        dict.put("Supra",1200);

        System.out.println(dict);
    }
}

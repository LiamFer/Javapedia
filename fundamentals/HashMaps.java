package fundamentals;

import java.util.HashMap;

public class HashMaps {
    public static void main (String[] args){
        HashMap<String,Director> movies = new HashMap<>();

        movies.put("Inception",Director.NOLAN);
        movies.put("Pulp Fiction",Director.TARANTINO);
        movies.put("Transformers",Director.MICHAEL_BAY);

        System.out.println(movies);

        for(String key : movies.keySet()){
            System.out.printf("The %s movie was directed by the %d director!\n",key,movies.get(key).getDirector());
        }

    }
}

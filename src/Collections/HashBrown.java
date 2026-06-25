package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashBrown {
    static void main(String[] args) {

        HashMap<String, Integer> populationByCity = new HashMap<>();


        populationByCity.put("New York",12231332);
        populationByCity.put("Las Vegas", 112234);
        populationByCity.put("San Francisco", 113561);


        System.out.println(populationByCity);

        if (populationByCity.containsKey("New York")) {
            System.out.println("This hashmap contains key newyork ");
        }

        System.out.println(populationByCity.keySet());
        System.out.println(populationByCity.values());
        System.out.println(populationByCity.entrySet());

        LinkedHashMap<String, Integer> orderedMap = new LinkedHashMap<>();

        orderedMap.put("New York",12231332);
        orderedMap.put("Las Vegas", 112234);
        orderedMap.put("San Francisco", 113561);

        System.out.println(orderedMap.entrySet());

    }

}

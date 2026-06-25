package Collections;

import java.util.TreeMap;

public class TreeMaps {
    static void main(String[] args) {

        TreeMap<String, Integer> sortedMap = new TreeMap<>();

        sortedMap.put("Key1", 10);
        sortedMap.put("Key5", 20);
        sortedMap.put("Key2", 30);
        sortedMap.put("Key3", 40);

//        sortedMap.entrySet().forEach(System.out::println);

        System.out.println(sortedMap.higherEntry("Key1"));
        System.out.println(sortedMap.lowerEntry("Key1"));



    }
}

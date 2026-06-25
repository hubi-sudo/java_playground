package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
    static void main(String[] args) {

        List<Integer> list = new ArrayList<>();


        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(3);

        System.out.println("Unsorted -> " + list );
        Collections.sort(list);
        System.out.println("Sorted -> " + list);

        System.out.println("Binary search result -> " + Collections.binarySearch(list,4));
        System.out.println("Binary search result -> " + Collections.binarySearch(list,7));

        System.out.println("Frequency of 3 -> " + Collections.frequency(list, 3));

        System.out.println("Max element in the list ->" + Collections.max(list));
        System.out.println("Min element in the list ->" + Collections.min(list));

        Collections.shuffle(list);
        System.out.println("Shuffled list -> " + list);

        Collections.swap(list, 0, 1);
        System.out.println("Swapped list -> " + list);

        Collections.fill(list, 3);
        System.out.println("Filled list with 3:" + list);

    }
}

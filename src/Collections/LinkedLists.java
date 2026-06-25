package Collections;

import java.util.LinkedList;

public class LinkedLists {
    static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        list.remove(1);
        list.remove(Integer.valueOf(3));

        list.offer(1);
        list.offer(2);
        list.offer(3);

        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());

        list.push(1);
        list.push(2);
        list.push(3);

        list.pop();
        list.pop();
//        list.pop();
//        list.pop();
//        list.pop();
//        list.pop();
        System.out.println(list);
    }
}

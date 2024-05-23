import list.MyArrayList;
import list.MyLinkedList;
import list.MyList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        MyList<Integer> list = new MyArrayList<>();
//        list.addLast(217);
//        list.addLast(218);
//        list.addLast(219);
//        list.delete(0);
//        System.out.println(list);

        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(3);
        linkedList.addFirst(5);
        System.out.println(linkedList.size());
        System.out.println(linkedList.getElement(1));



    }
}
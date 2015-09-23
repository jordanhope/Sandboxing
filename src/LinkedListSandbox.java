import java.util.LinkedList;
import java.util.List;

/**
 * Created by JordanHope on 9/23/2015.
 */
public class LinkedListSandbox {
    public static void main (String args[])
    {
        /*
         * Linked list creates a link to the next object in the list. Always just the size you need it to be, but
         * cannot be accessed by index, like in an arrayList. You have to go to each object until you reach the one
         * that you want. Is slower than ArrayList.
         */
        List list1 = new LinkedList();

        list1.add("Object 1");
        list1.add("Object 2");
        list1.add("Object 4");
        list1.add("Object 3");

        System.out.println(list1);
    }
}

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by JordanHope on 9/22/2015.
 */
public class LinkedHashSetSandbox {
    public static void main(String args[])
    {
        /*maintains a list of entries in the set, in the order in which they were inserted.
         * hybrid of a hash table and a linked list. does not accept duplicates
         */
        Set lhSet = new LinkedHashSet();


        String element = "element 1";

        lhSet.add(element);
        lhSet.add("Is");
        lhSet.add("My");
        lhSet.add(2.1);
        lhSet.add(3);
        lhSet.add('a');

        System.out.println(lhSet);


    }
}

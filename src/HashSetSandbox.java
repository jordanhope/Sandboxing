import java.util.HashSet;
import java.util.Set;

/**
 * Created by JordanHope on 9/22/2015.
 */
public class HashSetSandbox {
    public static void main(String args[]) {
        /* use a hashset to store elements when order does not matter and when
         * you do not want duplicates in your set of data.
         */

        //create new HashSet
        Set set = new HashSet();

        String element = "element 1";

        set.add(element);
        set.add("Is");
        set.add("My");
        set.add(2.1);
        set.add(3);
        set.add('a');

        System.out.println(set);

        //nasty path element null

        Set setA = new HashSet();

        String element1 = null;

        setA.add(element1);

        System.out.println(setA);

        setA.add(null);

        System.out.println(setA);

        // determine the type of set
        HashSet<String> setB = new HashSet<>();

        setB.add("3");
        setB.add("Hello");

        System.out.println(setB);
        //to remove an element from a set
        setB.remove("3");

        System.out.println(setB);
    }


}

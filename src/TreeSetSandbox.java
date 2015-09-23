import java.util.Set;
import java.util.TreeSet;

/**
 * Created by JordanHope on 9/22/2015.
 */
public class TreeSetSandbox {
    public static void main(String args[]) {
        /*
         * TreeSet will order elements in the set, does not accept duplicates.
         */
        Set set = new TreeSet();

        set.add("element");
        set.add("Is");
        set.add("My");
        set.add("2.1");
        set.add("3");
        set.add("a");

        System.out.println(set);
    }
}

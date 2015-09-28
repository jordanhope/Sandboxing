import java.util.Set;
import java.util.TreeSet;

/**
 * Created by JordanHope on 9/22/2015.
 */
public class TreeSetSandbox {
    public static void main(String args[]) {
        /*
         * TreeSet will order elements in the set, does not accept duplicates.
         * TreeSet has to either work with the same data type or has to be passed a
         * comparator. A comparator is a function that handles how different data types can be compared
         * example, a string should become before a char, but after int.
         */

        try {

//            creates a new TreeSet
        Set set = new TreeSet();

        set.add("element");
        set.add("Is");
        set.add("My");
        set.add("2.1");
        set.add("3");
        set.add("a");

            System.out.println(set);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Set setB = new TreeSet();

            setB.add(1);
            setB.add(5);
            setB.add(3);
            setB.add(2);
            setB.add(4);
            setB.add(1);
            setB.add("five");


            System.out.println(setB);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Set setC = new TreeSet();

            int a = 1;
            int b = 2;
            int c = 250000000;
            int d = 3;
            int e = 99999999;

            setC.add(a);
            setC.add(b);
            setC.add(c);
            setC.add(d);
            setC.add(e);

            System.out.println(setC);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }
}

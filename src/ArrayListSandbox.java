import java.util.ArrayList;
import java.util.List;

/**
 * Created by JordanHope on 9/23/2015.
 */
public class ArrayListSandbox {
    public static void main(String args[])
    {
        /*
         * ArrayList, stores objects in an array that can be accessed by index
         * in order to access an element in a ArrayList use the get function and the
         * index of the item you would like to access
         */
        List one = new ArrayList();

        one.add("element1");
        one.add(4);
        one.add(45);
        one.add(44);
        one.add(43);
        one.add(42);
        one.add(41);


        System.out.println(one);

        System.out.println(one.get(3));
    }
}

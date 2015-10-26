import java.util.ArrayList;


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
        ArrayList happy = new ArrayList();

        CarBean car  = new CarBean(1987, "Accord", "blue", "Honda");

        //happy path, arrayList of numbers
        happy.add(4);
        happy.add(45);
        happy.add(44);
        happy.add(43);
        happy.add(42);
        happy.add(41);

        System.out.println(happy);

        //storing the javabean and elements of a javabean in an ArrayList

        ArrayList bean = new ArrayList();

        bean.add(car);
        bean.add(car.getMake());
        bean.add(car.getModel());
        bean.add(car.getYear());
        bean.add(car.getColor());

        //print the arrayList
        System.out.println(bean);
        //print element of array list found in index 3
        System.out.println(bean.get(3));

        //add an element to a specific index
        bean.add(3, car);
        System.out.println(bean);

        //remove an element in a specific index
        bean.remove(3);
        System.out.println(bean);

        //clears an arrayList
        bean.clear();
        System.out.println(bean);

        //add all can add another collection to an array list.
        bean.addAll(happy);
        System.out.println(bean);

        //removes all elements in the array list
        bean.removeAll(bean);
        System.out.println(bean);


        /**************************************************************
         * NASTY PATHS
         **************************************************************/

        System.out.println("\n\n******NASTY PATHS******\n\n");

        ArrayList nasty = new ArrayList(3);

        nasty.add(1);
        nasty.add(2);
        nasty.add(3);
        nasty.add(4);

        System.out.println("This is arrayList nasty before I have done anything to it\n" + nasty + "\n");

        /***************************************************************
         * Add an element to an index that is out of current bounds
         * Throws an out of bounds exception
         * *************************************************************/

        System.out.println("Adding an element to an index that is out of bounds");
        try {
            nasty.add(7, 5);
            System.out.println(nasty);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /***********************************
         * Add an element using null index
         * Really doesn't like this
         * *********************************/
       /* try {
            nasty.add(null, 5);
            System.out.println(nasty);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /***********************************
         * Add an element that is null
         * Adds null just fine
         ***********************************/
        System.out.println("Add an element that is null");
        try {
            nasty.add(null);
            System.out.println(nasty);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*************************************
         * Removing elements that don't exist
         * Index out of bounds exception
         * ***********************************/
        System.out.println("\nRemoving an element that is out of bounds");
        try {
            nasty.remove(5);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

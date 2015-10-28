import java.util.LinkedList;


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

        /************************************
         * HAPPY PATHS
         ************************************/
        System.out.println("*****HAPPY PATH*****");
        System.out.println();


        LinkedList list1 = new LinkedList();

        System.out.println("This is a linked list of strings");
        list1.add("Object 1");
        list1.add("Object 2");
        list1.add("Object 4");
        list1.add("Object 3");

        System.out.println(list1);
        System.out.println();

        CarBean myCar = new CarBean(2014, "Cruze", "red", "Chevy");
        LinkedList car = new LinkedList();

        System.out.println("This is an array list containing a CarBean and some of the elements of a car");
        car.add(myCar);
        car.add(1, myCar.getModel());
        car.add(2, myCar.getMake());
        System.out.println(car);
        System.out.println();

        System.out.println("When an index is not defined it will put the element at the end of the list like so:");
        car.add("HER CAR");
        System.out.println(car);
        System.out.println();

        System.out.println("When you declare to put an element in in index that is already filled it pushes everything down like so:");
        car.add(1, myCar.getYear());
        System.out.println(car);
        System.out.println();

        System.out.println("Using addFirst to add an element to the begining of the list");
        car.addFirst("This is myCar");
        System.out.println(car);
        System.out.println();

        System.out.println("Using addLast to add an element to the end of the list");
        car.addLast("2004");
        System.out.println(car);
        System.out.println();

        System.out.println("using set replaces the element in a given index with a new given element");
        car.set(1, "MY CAR");
        System.out.println(car);
        System.out.println();

        System.out.println("removing HER CAR using remove");
        car.remove("HER CAR");
        System.out.println(car);
        System.out.println();

        System.out.println("Using removeLast");
        car.removeLast();
        System.out.println(car);
        System.out.println();

        System.out.println("The element in index 2 is: " + car.get(2));
        System.out.println();

        System.out.println("The element in the first index in LinkedList car is: " + car.getFirst());
        System.out.println();

        System.out.println("The element in the last index in LinkedList car is: " + car.getLast());
        System.out.println();

        System.out.println("car contains 2014: " + car.contains(2014));
        System.out.println();

        System.out.println("The index of the element 2014 is: " + car.indexOf(2014));
        System.out.println();

        car.add(0, "Chevy");
        System.out.println(car);
        System.out.println();

        System.out.println("The last index of Chevy is: " + car.lastIndexOf("Chevy"));
        System.out.println();

        car.add(1, 1);
        car.add(3, 1);
        car.add(1);

        System.out.println(car);
        System.out.println();

        System.out.println("Using removeFirstOccurrence to remove the first 1");
        car.removeFirstOccurrence(1);
        System.out.println(car);
        System.out.println();

        System.out.println("Using removeLastOccurrence to remove the last 1");
        car.removeLastOccurrence(1);
        System.out.println(car);
        System.out.println();

        car.remove(1);
        car.removeFirstOccurrence("Chevy");


        /*****************************
        * NASTY PATHS
        * ****************************/


        System.out.println("Before any nasty things");
        System.out.println(car);

        System.out.println("*****NASTY PATHS*****");
        System.out.println();

        System.out.println("Adding element to index that is out of bounds");
        try {
            car.add(10, "out of bounds");
            System.out.println(car);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Can't add an element using an index out of bounds");
        }

        System.out.println("Adding an element that is null");
        try {
            car.add(null);
            System.out.println(car);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot add a null element");
        }

        System.out.println("Removing an element that does not exist");
        try {
            car.remove("Nancy");
            System.out.println(car);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Removing an element from an index that does not exist");
        try {
            car.remove(7);
            System.out.println(car);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot remove an element from an index that is out of bounds");
        }

        System.out.println("Add an element trying to use a negative index");
        try {
            car.add(-1, "HONDA");
            System.out.println(car);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot add an element using a negative index");
        }
    }
}

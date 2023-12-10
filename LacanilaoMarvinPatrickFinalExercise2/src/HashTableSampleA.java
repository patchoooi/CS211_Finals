/**
 @author Lacanilao, Marvin Patrick D.
 @activity Individual Exercise 2 - Finals
 @classcode 9342 - CS 211 Data Structures
 -----------------------------------------------------------------------------------------------------------------
 SAMPLE RUN:
 {2374421=(Lord,18), 1175645516=(Kathleen,17)}
 {2140939337=(Gracie,20), 2374421=(Lord,18), 1175645516=(Kathleen,17)}

 2140939337=(Gracie,20)
 ,2374421=(Lord,18)
 ,1175645516=(Kathleen,17)

 2140939337
 ,2374421
 ,1175645516

 (Gracie,20)
 ,(Lord,18)
 ,(Kathleen,17)

 Enter a name to search:
 Gracie
 (Gracie,20)

 Process finished with exit code 0
 */

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

/**
 * This class demonstrates the usage of a Hashtable with custom objects (Person) in Java.
 */
public class HashTableSampleA {

    /**
     * Prints the elements of an iterator, separated by commas.
     *
     * @param iterator The iterator to print elements from.
     */
    public static void print(Iterator iterator) {
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
            while (iterator.hasNext()) {
                System.out.println("," + iterator.next());
            }
        }
    }

    /**
     * The main method demonstrating the usage of Hashtable with custom objects (Person).
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Create a Hashtable with Integer keys and Person values, with an initial capacity of 4.
        Hashtable<Integer, Person> hashTable1 = new Hashtable<>(4);
        hashTable1.put("Lord".hashCode(), new Person("Lord", 18));
        hashTable1.put("Kathleen".hashCode(), new Person("Kathleen", 17));

        System.out.println(hashTable1);

        // Add a new entry to the Hashtable.
        hashTable1.put("Gracie".hashCode(), new Person("Gracie", 20));

        System.out.println(hashTable1);

        System.out.println();
        // Print the entries, keys, and values using the custom print method.
        print(hashTable1.entrySet().iterator());
        System.out.println();
        print(hashTable1.keySet().iterator());
        System.out.println();
        print((Iterator) hashTable1.elements());
        System.out.println();

        System.out.println("Enter a name to search: ");
        String searchKey = keyboard.nextLine();

        // Print the Person object associated with the entered name's hash code.
        System.out.println(hashTable1.get(searchKey.hashCode()));
    }
}
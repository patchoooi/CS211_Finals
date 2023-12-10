/**
 @author Lacanilao, Marvin Patrick D.
 @activity Individual Exercise 3 - Finals
 @classcode 9342 - CS 211 Data Structures
 -----------------------------------------------------------------------------------------------------------------
 SAMPLE RUN:
 Display entries in Hash Map
 {Lewis=29, Smith=30, Cook=29, Anderson=31}

 Display entries in ascending order of key
 {Anderson=31, Cook=29, Lewis=29, Smith=30}
 The age for Lewis is 29

 Display entries in LinkedHashMap
 {Smith=30, Anderson=31, Cook=29, Lewis=29}

 Process finished with exit code 0
 */

import java.util.*;

/**
 * A simple program to demonstrate the use of HashMap, TreeMap, and LinkedHashMap in Java.
 * It populates a HashMap, displays its entries, converts it to a TreeMap and displays entries in ascending order,
 * and also demonstrates the usage of a LinkedHashMap with access-ordering.
 */
public class TestHashMap {

    /**
     * The main method that serves as the entry point of the program.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Creating a HashMap to store name-age pairs
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        // Displaying entries in the HashMap
        System.out.println("Display entries in Hash Map");
        System.out.println(hashMap + "\n");

        // Converting the HashMap to a TreeMap for ascending order of keys
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Displaying entries in ascending order of keys
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        // Creating a LinkedHashMap with access-ordering
        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(16, 0.75f, true);

        // Populating the LinkedHashMap with name-age pairs
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        // Displaying the age for a specific name from the LinkedHashMap
        System.out.println("The age for Lewis is " +
                linkedHashMap.get("Lewis").intValue());

        // Displaying entries in the LinkedHashMap
        System.out.println("\nDisplay entries in LinkedHashMap");
        System.out.println(linkedHashMap);
    }
}

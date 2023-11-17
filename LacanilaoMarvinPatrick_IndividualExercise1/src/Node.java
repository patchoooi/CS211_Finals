/**
 @author Lacanilao, Marvin Patrick D.
 @activity Individual Exercise 1 - Finals
 @classcode 9342 - CS 211 Data Structures
 @date 17 November 2023
 */

import java.util.*;

/**
 * Represents a node in a graph with an identifier and a list of neighboring edges.
 */
public class Node {
    // Unique identifier for the node
    private int id;

    // List to store neighboring edges
    private List<Edge> neighbors = new ArrayList<Edge>();

    /**
     * Constructor to initialize a node with a given identifier.
     *
     * @param id The unique identifier for the node.
     */
    public Node(int id) {
        this.id = id;
    }

    /**
     * Gets the identifier of the node.
     *
     * @return The identifier of the node.
     */
    public int getId() {
        return id;
    }

    /**
     * Adds a neighboring edge to the node.
     *
     * @param e The edge to be added as a neighbor.
     */
    public void addNeighbor(Edge e) {
        if (this.neighbors.contains(e)) {
            System.out.println("This edge has already been used for this node");
        } else {
            System.out.println("Successfully added " + e);
            this.neighbors.add(e);
        }
    }

    /**
     * Prints information about all neighboring edges of the node.
     */
    public void getNeighbors() {
        System.out.println("List of all edges that node " + this.id + " has: ");
        System.out.println("===================================");

        for (int i = 0; i < this.neighbors.size(); i++) {
            System.out.println("ID of Edge: " + neighbors.get(i).getId() +
                    "\nID of the first node: " + neighbors.get(i).getStart() +
                    "\nID of the second node: " + neighbors.get(i).getEnd());
            System.out.println();
        }

        // Print the list of neighbors directly
        System.out.println(neighbors);
    }

    /**
     * Returns a string representation of the node.
     *
     * @return A string representation of the node.
     */
    @Override
    public String toString() {
        return "" + id;
    }
}

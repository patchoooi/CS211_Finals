/**
 @author Lacanilao, Marvin Patrick D.
 @activity Individual Exercise 1 - Finals
 @classcode 9342 - CS 211 Data Structures
 @date 17 November 2023
 */

/**
 * Represents an edge in a graph with a start node, end node, weight, and identifier.
 */
public class Edge {
    // The starting node of the edge
    private Node start;

    // The ending node of the edge
    private Node end;

    // The weight of the edge
    private double weight;

    // Unique identifier for the edge
    private int id;

    /**
     * Constructor to initialize an edge with a start node, end node, weight, and identifier.
     *
     * @param start  The starting node of the edge.
     * @param end    The ending node of the edge.
     * @param weight The weight of the edge.
     * @param id     The unique identifier for the edge.
     */
    public Edge(Node start, Node end, double weight, int id) {
        this.start = start;
        this.end = end;
        this.weight = weight;
        this.id = id;
    }

    /**
     * Gets the identifier of the edge.
     *
     * @return The identifier of the edge.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the starting node of the edge.
     *
     * @return The starting node of the edge.
     */
    public Node getStart() {
        return start;
    }

    /**
     * Gets the ending node of the edge.
     *
     * @return The ending node of the edge.
     */
    public Node getEnd() {
        return end;
    }

    /**
     * Gets the weight of the edge.
     *
     * @return The weight of the edge.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns a string representation of the edge.
     *
     * @return A string representation of the edge.
     */
    @Override
    public String toString() {
        return "(" + start + "," + end + ")";
    }
}

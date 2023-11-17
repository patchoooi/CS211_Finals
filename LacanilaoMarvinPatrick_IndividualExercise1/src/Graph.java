/**
 @author Lacanilao, Marvin Patrick D.
 @activity Individual Exercise 1 - Finals
 @classcode 9342 - CS 211 Data
 @date 17 November 2023
 */

import java.util.*;

/**
 * Represents a graph data structure with nodes.
 */
public class Graph {

    // List to store nodes in the graph
    private List<Node> nodes = new ArrayList<Node>();

    // Variable to keep track of the number of nodes in the graph
    private int numberOfNodes = 0;

    /**
     * Checks if the graph has more than one node.
     *
     * @return true if there are more than one node, false otherwise.
     */
    public boolean checkForAvailability() {
        return this.numberOfNodes > 1;
    }

    /**
     * Adds a new node to the graph.
     *
     * @param node The node to be added to the graph.
     */
    public void createNode(Node node) {
        this.nodes.add(node);
        ++this.numberOfNodes;
    }

    /**
     * Gets the number of nodes in the graph.
     *
     * @return The number of nodes in the graph.
     */
    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }
}


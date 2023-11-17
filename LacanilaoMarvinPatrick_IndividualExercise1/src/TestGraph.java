/**
 @author Lacanilao, Marvin Patrick D.
 @activity Individual Exercise 1 - Finals
 @classcode 9342 - CS 211 Data Structures
 @date 17 November 2023
 -----------------------------------------------------------------------------------------------------------------
 SAMPLE RUN:

 Successfully added (1,2)
 Successfully added (1,3)
 List of all edges that node 1 has:
 ===================================
 ID of Edge: 1
 ID of the first node: 1
 ID of the second node: 2

 ID of Edge: 2
 ID of the first node: 1
 ID of the second node: 3

 [(1,2), (1,3)]

 Process finished with exit code 0

 */

public class TestGraph {

    public static void main(String[] args) {
        // Create a new graph
        Graph graph = new Graph();

        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        // Add nodes to the graph
        graph.createNode(node1);
        graph.createNode(node2);
        graph.createNode(node3);

        // Create edges
        Edge e12 = new Edge(node1, node2, 5, 1);
        Edge e13 = new Edge(node1, node3, 10, 2);

        // Check if the graph has more than one node
        if (graph.checkForAvailability()) {
            // Add edges as neighbors to node1
            node1.addNeighbor(e12);
            node1.addNeighbor(e13);

            // Print information about neighbors of node1
            node1.getNeighbors();
        } else {
            // Print a message if there are less than 2 nodes
            System.out.println("There are less than 2 nodes. Add more to connect.");
        }
    }
}
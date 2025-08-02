package graphs;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Graphs my_graph = new Graphs();
        
        // // Adding vertices
        // my_graph.addVertex("A");
        // my_graph.addVertex("B");
        // my_graph.addVertex("C");

        // my_graph.addEdge("A", "B");
        // my_graph.addEdge("B", "C");
        // my_graph.addEdge("A", "C");

        // // Printing the graph
        // my_graph.print();

        // my_graph.removeEdge("A", "B");
        // my_graph.print();

        // my_graph.removeVertex("C");
        // my_graph.print();

        Multicomponent multiGraph = new Multicomponent();
        List<List<Integer>> edges = Arrays.asList(
             Arrays.asList(0, 1),
             Arrays.asList(1, 2),
             Arrays.asList(2, 3),
             Arrays.asList(4, 5)
        );
        int V = 7; // Number of vertices
        int components = multiGraph.findConnectedComponents(V, edges);
        System.out.println("Number of connected components: " + components);
    }
}

package graphs;
import java.util.HashMap;
import java.util.List;

// THE CORRECT SOLUTION FOR MULTICOMPONENT GRAPH IS DFS OR BFS BASED
// HOWEVER, I HAVE USED NORMAL TRAVERSAL ALGORITHM BECAUSE I DIDN'T LEARN DFS OR BFS YET....

public class Multicomponent extends Graphs {

    // Method to find all connected components in the graph
    public int findConnectedComponents(int V, List<List<Integer>> edges) {
        // Creating an adjacency list from the edges
        HashMap<Integer, List<Integer>> adjList = getAdjacencyList(edges);
        // Initialize and insert zeroes
        int[] traverse = new int[V];
        for(int i = 0; i < traverse.length; i++){
            traverse[i] = 0;
        }
        
        int component = 0;
        // Traverse through the adjList:
        for(int i = 0; i < V; i++){
            if (traverse[i] == 0){
                traverse[i] = 1;
                component++;
            }
            List<Integer> edgeList = adjList.get(i);
            if(edgeList != null){
                for(int j: edgeList){
                traverse[j] = 1;
              }
            }
        }
        return component;
    }
}

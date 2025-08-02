package graphs;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Graphs {

    private HashMap<String, ArrayList<String>> adjacencyList = new HashMap<>();

    // Printing the graph
    public void print(){
        System.out.println(adjacencyList);
    }

    // Adding a vertex to the graph
    public boolean addVertex(String vertex){
        if(adjacencyList.get(vertex) == null){
            adjacencyList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    // Adding an edge between two vertices
    public boolean addEdge(String vertex1, String vertex2){
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null){
            adjacencyList.get(vertex1).add(vertex2);
            adjacencyList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    // Remove an edge between two vertices
    public boolean removeEdge(String vertex1, String vertex2){
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null){
            adjacencyList.get(vertex1).remove(vertex2);
            adjacencyList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    // Remove a vertex from the graph
    public boolean removeVertex(String vertex){
        if(adjacencyList.get(vertex) != null){
            // Get the list of edges for the vertex
            ArrayList<String> edges = adjacencyList.get(vertex);
            // Iterate through the edges and remove the vertex from each edge
            for(String edge: edges){
                adjacencyList.get(edge).remove(vertex);
            }
            // Finally, remove the vertex from the adjacency list
            adjacencyList.remove(vertex);
            return true;
        }
        return false;
    }

    public HashMap<Integer, List<Integer>> getAdjacencyList(List<List<Integer>> edges) {
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        for(List<Integer> edge: edges){
            // index - 0
            if(adjList.get(edge.get(0)) == null){
               adjList.put(edge.get(0), new ArrayList<Integer>(Arrays.asList(edge.get(1))));
            }else if(adjList.get(edge.get(0)) != null){
                adjList.get(edge.get(0)).add(edge.get(1));
            }
            
            // index - 1
            if(adjList.get(edge.get(1)) == null){
                adjList.put(edge.get(1), new ArrayList<Integer>(Arrays.asList(edge.get(0))));
            }else if(adjList.get(edge.get(1)) != null){
                adjList.get(edge.get(1)).add(edge.get(0));
            }
        }
        return adjList;
    }
}

package DSA;

import java.util.ArrayList;
import java.util.List;

public class TestDsa {
    public static void main(String[] args) {

        int k = 10;
        System.out.println("The " + k + "th Fibonacci number is: " + Fibonnaci.fibonacci(k));


        /**
         * Dijkstra
         * */
        int n = 5;
        List<List<DijkstraShortestPath.Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // Adding edges to the graph
        graph.get(0).add(new DijkstraShortestPath.Edge(1, 4));
        graph.get(0).add(new DijkstraShortestPath.Edge(2, 1));
        graph.get(1).add(new DijkstraShortestPath.Edge(2, 2));
        graph.get(1).add(new DijkstraShortestPath.Edge(3, 5));
        graph.get(2).add(new DijkstraShortestPath.Edge(3, 1));
        graph.get(3).add(new DijkstraShortestPath.Edge(4, 3));

        int start = 0;
        int[] shortestDistances = DijkstraShortestPath.dijkstra(graph, start);

        // Printing shortest distances from the start node
        for (int i = 0; i < n; i++) {
            System.out.println("Shortest distance from node " + start + " to node " + i + " is: " + shortestDistances[i]);
        }

    }
}

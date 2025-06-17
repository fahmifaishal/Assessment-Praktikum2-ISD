public class Main {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(10); 

        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 2); 
        graph.addEdge(1, 4); 
        graph.addEdge(2, 4); 
        graph.addEdge(2, 5); 
        graph.addEdge(3, 4); 
        graph.addEdge(3, 6); 
        graph.addEdge(4, 5); 
        graph.addEdge(4, 7); 
        graph.addEdge(5, 7); 
        graph.addEdge(6, 8); 
        graph.addEdge(8, 9); 
        graph.addEdge(7, 9); 

        graph.bfs(0); 
        graph.dfs(0); 
    }
}

package main.lab1.optional;

import java.util.LinkedList;
import java.util.Queue;

public class OptionalLab1 {

    /**
     * Creates a linked list which I use for the bfs algorithm
     * **/
    private Queue<Integer> queue;
    public OptionalLab1() {
        queue = new LinkedList<Integer>();
    }
    /**
     * Creates an adjacency matrix for a random graph.
     * the if statement regarding the size of "n" is there because I don't want to print incredibly big matrices
     * **/
    int[][] createAdjacencyMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) matrix[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    int hasNode = (int) Math.round(Math.random());
                    matrix[i][j] = hasNode;
                    matrix[j][i] = hasNode;

                }
            }
        }

        if (n < 30000) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        return matrix;
    }
    /**
     * Prints the connected vertices in the unconnected graph
     * **/
    public void vertexNumber(int number_of_nodes, int[] visited) {
        for (int vertex = 0; vertex <= number_of_nodes; vertex++) {
            if (visited[vertex] == 1) {
                System.out.println(vertex);
            }
        }
    }
    /**
     * Prints the partial tree of a graph
     * **/
    public void printGraphPartialTree(int[][] graphTree, int n) {
        if (n < 30000) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(graphTree[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
    /**
     * This algorithm checks for the connectivity of the graph, using the bfs traversal with a linked list.
     * It also prints if the graph is connected or not( plus the connected vertices)
     * **/
    public void bfs(int[][] adjacency_matrix, int source, int n) {

        int number_of_nodes = adjacency_matrix[source].length - 1;
        int[] visited = new int[number_of_nodes + 1];
        int i, element;
        visited[source] = 1;
        queue.add(source);
        while (!queue.isEmpty()) {
            element = queue.remove();
            i = element;
            while (i <= number_of_nodes) {
                if (adjacency_matrix[element][i] == 1 && visited[i] == 0) {
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }

        boolean connected = false;
        for (int vertex = 0; vertex < number_of_nodes; vertex++) {
            if (visited[vertex] == 1) {
                connected = true;
            } else {
                connected = false;
                break;
            }
        }

        if (connected) {
            System.out.println("The graph is connected");
            boolean[] visitedTree = new boolean[n];
            int[][] graphTree = new int[n][n];
            getPartialTreeDFS(0, adjacency_matrix, visitedTree, graphTree);
            printGraphPartialTree(graphTree, n);
        } else {
            if (n < 30000) {
                vertexNumber(number_of_nodes, visited);
                System.out.println("The graph is disconnected");
            }
        }
    }
    /**
     * Creates a partial tree of the graph
     * **/
    public void getPartialTreeDFS(int start, int[][] graph, boolean[] visited, int[][] treeMatrix) {
        visited[start] = true;

        for (int i = 0; i < graph[start].length; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                treeMatrix[start][i] = 1;
                treeMatrix[i][start] = 1;
                getPartialTreeDFS(i, graph, visited, treeMatrix);
            }
        }
    }
    /**
     * In the main class, I validate the parameters and compile the problem given in the Optional part of the laboratory
     * **/
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Not enough arguments!");
            System.exit(-1);
        }
        long timpInceput = System.nanoTime();
        OptionalLab1 app = new OptionalLab1();
        int n = Integer.parseInt(args[0]);
        int[][] matrice = app.createAdjacencyMatrix(n);
        app.bfs(matrice, 0, n);
        long timpfinal = System.nanoTime();
        if(n>30000){
            System.out.println(timpfinal - timpInceput);
        }
    }
}

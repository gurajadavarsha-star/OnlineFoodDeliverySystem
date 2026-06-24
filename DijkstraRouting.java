package ONLINEFOODDELIVERYSYSTEM;
import java.util.*;

public class DijkstraRouting {

    public static void runDijkstra(Scanner sc) {

        System.out.println("\n===== DIJKSTRA SHORTEST PATH =====");

        System.out.print("Please Enter Number Of Locations : ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("\nEnter Adjacency Matrix:");
        System.out.println("(Enter 0 if there is no direct path)");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("Distance from Location "
                        + i + " to Location "
                        + j + " : ");

                graph[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nPlease Enter Source Location : ");
        int source = sc.nextInt();

        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int count = 0; count < n - 1; count++) {

            int u = -1;

            for (int i = 0; i < n; i++) {

                if (!visited[i] &&
                        (u == -1 || dist[i] < dist[u])) {

                    u = i;
                }
            }

            visited[u] = true;

            for (int v = 0; v < n; v++) {

                if (graph[u][v] != 0 &&
                        !visited[v] &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("\n===== SHORTEST ROUTES =====");

        for (int i = 0; i < n; i++) {

            System.out.println(
                    "From Location "
                            + source
                            + " To Location "
                            + i
                            + " = "
                            + dist[i]
                            + " KM");
        }

        System.out.println("\nShortest Route Calculation Completed Successfully.");
    }
}

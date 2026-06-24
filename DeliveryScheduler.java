package ONLINEFOODDELIVERYSYSTEM;
import java.util.*;

public class DeliveryScheduler {

    public static void assignOrders(
            Scanner sc) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        Collections.reverseOrder());

        System.out.print(
                "\nPlease Enter Number Of Orders : ");

        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {

            System.out.print(
                    "Enter Priority For Order "
                            + i
                            + " : ");

            pq.add(sc.nextInt());
        }

        System.out.println(
                "\nOrders Assigned Based On Priority");

        while(!pq.isEmpty()) {

            System.out.println(
                    "Assigned Order Priority : "
                            + pq.poll());
        }
    }
}

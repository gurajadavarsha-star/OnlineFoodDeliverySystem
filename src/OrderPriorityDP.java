package ONLINEFOODDELIVERYSYSTEM;
import java.util.*;

public class OrderPriorityDP {

    public static void runDP(
            Scanner sc) {

        System.out.print(
                "\nPlease Enter Number Of Orders : ");

        int n = sc.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];

        for(int i=0;i<n;i++) {

            System.out.print(
                    "Enter Profit Value For Order "
                            + (i+1)
                            + " : ");

            value[i] = sc.nextInt();

            System.out.print(
                    "Enter Delivery Time For Order "
                            + (i+1)
                            + " : ");

            weight[i] = sc.nextInt();
        }

        System.out.print(
                "Please Enter Maximum Delivery Capacity : ");

        int capacity = sc.nextInt();

        int result =
                maximizeProfit(
                        value,
                        weight,
                        capacity);

        System.out.println(
                "\nMaximum Achievable Profit : "
                        + result);
    }

    public static int maximizeProfit(
            int[] value,
            int[] weight,
            int capacity) {

        int n = value.length;

        int[][] dp =
                new int[n+1][capacity+1];

        for(int i=1;i<=n;i++) {

            for(int w=1;w<=capacity;w++) {

                if(weight[i-1]<=w) {

                    dp[i][w] =
                            Math.max(
                                    value[i-1]
                                            + dp[i-1][
                                            w-weight[i-1]],
                                    dp[i-1][w]);
                }
                else {

                    dp[i][w]
                            = dp[i-1][w];
                }
            }
        }

        return dp[n][capacity];
    }
}

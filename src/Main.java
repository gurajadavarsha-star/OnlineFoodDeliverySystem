package ONLINEFOODDELIVERYSYSTEM;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Restaurant> restaurants = new ArrayList<>();

        while(true) {

            System.out.println("\n=================================");
            System.out.println(" ONLINE FOOD DELIVERY SYSTEM ");
            System.out.println("=================================");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Display Restaurants");
            System.out.println("3. Sort Restaurants By Rating");
            System.out.println("4. Find Delivery Route");
            System.out.println("5. Assign Orders");
            System.out.println("6. Maximize Profit");
            System.out.println("7. Exit");

            System.out.print("\nPlease Enter Your Choice : ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println("\n----- Add Restaurant -----");

                    System.out.print("Please Enter Restaurant ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Please Enter Restaurant Name : ");
                    String name = sc.nextLine();

                    System.out.print("Please Enter Restaurant Rating : ");
                    double rating = sc.nextDouble();

                    restaurants.add(
                            new Restaurant(id,name,rating));

                    System.out.println(
                            "\nRestaurant Added Successfully.");

                    break;

                case 2:

                    System.out.println("\n----- Restaurant List -----");

                    if(restaurants.isEmpty()) {
                        System.out.println(
                                "No Restaurants Available.");
                    }
                    else {

                        for(Restaurant r : restaurants) {
                            System.out.println(r);
                        }
                    }

                    break;

                case 3:

                    if(restaurants.isEmpty()) {

                        System.out.println(
                                "Please Add Restaurants First.");
                    }
                    else {

                        RestaurantSorter
                                .sortByRating(restaurants);
                    }

                    break;

                case 4:

                   DijkstraRouting.runDijkstra(sc);
                   
                    break;

                case 5:

                    DeliveryScheduler.assignOrders(sc);

                    break;

                case 6:

                    OrderPriorityDP.runDP(sc);

                    break;

                case 7:

                    System.out.println(
                            "\nThank You For Using The System.");

                    System.exit(0);

                default:

                    System.out.println(
                            "\nInvalid Choice. Please Try Again.");
            }
        }
    }
}

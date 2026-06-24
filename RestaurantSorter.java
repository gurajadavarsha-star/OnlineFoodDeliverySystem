package ONLINEFOODDELIVERYSYSTEM;

import java.util.*;

public class RestaurantSorter {

    public static void sortByRating(
            List<Restaurant> restaurants) {

        restaurants.sort(
                (a,b) ->
                        Double.compare(
                                b.rating,
                                a.rating));

        System.out.println(
                "\nRestaurants Sorted Successfully.");

        for(Restaurant r : restaurants) {

            System.out.println(r);
        }
    }
}
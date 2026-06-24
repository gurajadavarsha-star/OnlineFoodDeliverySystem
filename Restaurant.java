package ONLINEFOODDELIVERYSYSTEM;




public class Restaurant {

    int id;
    String name;
    double rating;

    public Restaurant(int id,
                      String name,
                      double rating) {

        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {

        return "Restaurant ID : " + id +
                "\nRestaurant Name : " + name +
                "\nRestaurant Rating : " + rating +
                "\n---------------------------";
    }
}

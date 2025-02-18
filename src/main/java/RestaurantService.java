import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;


public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();


    public Restaurant findRestaurantByName(String restaurantName){



            for(Restaurant restaurant: restaurants) {
                if(restaurant.getName().equals(restaurantName))
                    return restaurant;
            }
            return null;

        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}

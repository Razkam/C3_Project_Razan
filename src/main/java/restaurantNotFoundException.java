public class RestaurantNotFoundException extends RuntimeException {
    public RestaurantNotFoundException(String name)
    {
        super(name);
    }
}

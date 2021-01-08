import java.util.ArrayList;
import java.util.List;

public class Order {


    private final Integer price;
    private static final List<Order> orders = new ArrayList<>();

    public Order(String name, Integer price) {
        this.price = price;
    }

    public Integer getOrderPrice() {
        return this.price;
    }
    public void addOrder(String name,Integer price) {
        Order order = new Order(name,price);
        this.getOrders().add(order);

    }

    // }
    public Integer calculateTotalOrder() {
        //Loop over all the beverages that have been added to the map summing the cost.
        int totalOrder= getOrderPrice();

        for (Order order: orders) {

            totalOrder = totalOrder+order.getOrderPrice();


        }
        return totalOrder;
    }
    public List<Order> getOrders() {
        return orders;
    }


}




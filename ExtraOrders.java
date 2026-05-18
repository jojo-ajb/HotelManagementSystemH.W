package I3.Classes;

/**
 *
 * @author Faysal Ahmed
 */
public class ExtraOrders {
// This class represents extra items ordered by customer and calculates total price
    private int order_id;
    private int customerId;
    private String orderDateTime;
    private int quantity;
    private Item item;
    //int order_total;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getCustomer_id() {
        return customerId;
    }

    public void setCustomer_id(int customer_id) {
        this.customerId = customer_id;
    }

    public String getDateTime() {
        return orderDateTime;
    }

    public void setDateTime(String dateTime) {
        this.orderDateTime = dateTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
   public int calculateTotal() {
    if (item == null) return 0;
    return item.getPrice() * quantity;
}

    
    
    
    
}

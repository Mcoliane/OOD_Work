import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItem> items;
    private double totalAmount;

    //makes a new list when an order is  created
    public Order() {
        items = new ArrayList<>();
    }


    public void addItem(MenuItem item) {
        items.add(item);
    } //method to add items

    //calculates the total
    public void calculateTotal() {
        totalAmount = 0;
        for (MenuItem item : items) {
            totalAmount += item.getPrice();
        }
    }
    //display the current order
    public void displayOrderDetails() {
        System.out.println("Order Details:");
        for (MenuItem item : items) {
            item.displayItemInfo();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}


import java.util.ArrayList;

public class Cafe {
    private ArrayList<MenuItem> menuItems;
    private Order currentOrder;


    public Cafe() {
        menuItems = new ArrayList<>();
    }


    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }


    public void placeOrder(Order order) {
        this.currentOrder = order;
        currentOrder.calculateTotal();
    }


    public void displayMenu() {
        System.out.println("Cool Club Penguin Cafe Menu:");
        for (MenuItem item : menuItems) {
            item.displayItemInfo();
        }
    }
}

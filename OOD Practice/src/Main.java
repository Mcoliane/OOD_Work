
public class Main {
    public static void main(String[] args) {

        Cafe coolCafe = new Cafe();
        MenuItem coffee = new MenuItem("Coffee", 3.50, "Beverage");
        MenuItem doughnuts = new MenuItem("Doughnuts", 2.00, "Food");
        MenuItem sandwich = new MenuItem("Sandwich", 2.50, "food");
        MenuItem chili = new MenuItem("Chili", 5.00, "Food");

        coolCafe.addMenuItem(coffee);
        coolCafe.addMenuItem(doughnuts);
        coolCafe.addMenuItem(chili);
        coolCafe.addMenuItem(sandwich);

        coolCafe.displayMenu();

        Order custOrder = new Order();
        custOrder.addItem(chili);
        custOrder.addItem(sandwich);

        coolCafe.placeOrder(custOrder);
        System.out.println("--------------------------------------");
        custOrder.displayOrderDetails();
    }
}

public class MenuItem {
    //declaring variables
    public String name;
    public String category;
    public Double price;
    //constructing a menu utem
    public MenuItem(String name, Double price, String category) {

        this.name = name;

        this.category = category;

        this.price = price;

    }
    //getters and setters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    //display info
    public void displayItemInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Category: " + getCategory());
        System.out.println();
    }
}

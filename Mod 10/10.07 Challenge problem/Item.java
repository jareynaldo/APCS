// The purpose of this program is to create item objects 
// such that I can work with them in the StoreInventory program
//
// By: Jose Reynaldo
// 11/4/23 

class Item {
    private String name;
    private int productNumber;
    private double price;
    private int quantity;

    public Item(String name, int productNumber, double price, int quantity) {
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return String.format("%-20s%-20d$%10.2f%15d", name, productNumber, price, quantity);
    }
}

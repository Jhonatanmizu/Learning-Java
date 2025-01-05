package poo;

public class Product {

    private String name = "";
    private double price = 0;
    private int quantity = 0;

    public static void main(String[] args) {
        Product smartphone = new Product("A55", 2000, 2);
        smartphone.addProducts(10);
        System.out.println(smartphone);
    }

    public Product(String newName, double newPrice, int newQuantity) {
        this.name = newName;
        this.price = newPrice;
        this.quantity = newQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public String toString() {
        return "NAME: " + this.getName() +
                " " +
                "QUANTITY: " +
                this.getQuantity() +
                " " +
                "PRICE: $ "
                + String.format("%.2f", this.getPrice())
                + " " + "TOTAL VALUE: "
                + " "
                + String.format("%.2f", this.totalValueInStock());
    }

    public void addProducts(int newQuantity) {
        this.setQuantity(this.quantity + newQuantity);
    }

    public void removeProducts(int newQuantity) {
        this.setQuantity(this.quantity - newQuantity);
    }
}

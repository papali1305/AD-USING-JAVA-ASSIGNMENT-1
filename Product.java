// Question 2 



public class Product {
    int prodId;
    double price;
    int quantity;
    static double totalPrice = 0.0;

    public Product(int prodId, double price, int quantity) {
        this.prodId = prodId;
        this.price = price;
        this.quantity = quantity;
        totalPrice += price * quantity;
    }

    public void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + price * quantity);
        System.out.println();
    }

    public static void displayTotalPrice() {
        System.out.println("Total Amount to Pay: " + totalPrice);
    }

    public static void main(String[] args) {
        Product product1 = new Product(1, 10.99, 2);
        Product product2 = new Product(2, 5.99, 3);
        Product product3 = new Product(3, 7.99, 1);
        Product product4 = new Product(4, 12.99, 2);
        Product product5 = new Product(5, 8.99, 1);

        System.out.println("Product Details:");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
        product5.display();

        Product.displayTotalPrice();
    }
}
import java.math.BigDecimal;

public class Shop {
    public static void main(String[] args) {
        // Instantiating class Product - creating object of class Product
        Product p1 = new Product();

        // Set a new values for Id, Name & Price
        p1.setId(1);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));

        // Print the result in Console
        System.out.println(p1.getId() + ", " + p1.getName() + ", " + p1.getPrice() + " " + p1.getDiscount());
    }
}

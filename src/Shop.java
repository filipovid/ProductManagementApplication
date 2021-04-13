import java.math.BigDecimal;
import java.time.LocalDate;

public class Shop {
    public static void main(String[] args) {
        // Instantiating class Product - creating object of class Product
        Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
        Product p2 = new Product(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Food(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = new Product();
        Product p5 = p3.applyRating(Rating.THREE_STAR);

        // Print the result in Console
        System.out.println("Id: " + p1.getId() + ", Name: " + p1.getName() + ", Price: " + p1.getPrice() + ", Discount:" + p1.getDiscount() + ", Rating: " + p1.getRating().getStars());
        System.out.println("Id: " + p2.getId() + ", Name: " + p2.getName() + ", Price: " + p2.getPrice() + ", Discount:" + p2.getDiscount() + ", Rating: " + p2.getRating().getStars());
        System.out.println("Id: " + p3.getId() + ", Name: " + p3.getName() + ", Price: " + p3.getPrice() + ", Discount:" + p3.getDiscount() + ", Rating: " + p3.getRating().getStars());
        System.out.println("Id: " + p4.getId() + ", Name: " + p4.getName() + ", Price: " + p4.getPrice() + ", Discount:" + p4.getDiscount() + ", Rating: " + p4.getRating().getStars());
        System.out.println("Id: " + p5.getId() + ", Name: " + p5.getName() + ", Price: " + p5.getPrice() + ", Discount:" + p5.getDiscount() + ", Rating: " + p5.getRating().getStars());

    }
}

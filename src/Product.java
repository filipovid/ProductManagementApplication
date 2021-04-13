import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Product {
    /**
     * A constant that defines a {@link java.math.BigDecimal BigDecimal} value of the discount rate
     * Discount rate is 10%
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    public Product() {
        this(0, "no name", BigDecimal.ZERO, Rating.NOT_RATED);
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Rating getRating() {
        return this.rating;
    }

    /**
     * Calculate discount based on product price and DISCOUNT_RATE
     * @return a {@link java.math.BigDecimal BigDecimal} value of the discount
     */
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public Product applyRating(Rating newRating) {
        return new Product(this.id, this.name, this.price, newRating);
    }

    @Override
    public String toString() {
        return "Id:" + id + ", Name: " + name + ", Price: " + price + ", Discount: " + ", Rating: " + rating.getStars();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Product) {
            final Product other = (Product) obj;
            return this.id == other.id && Objects.equals(this.name, other.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
        return hash;
    }
}

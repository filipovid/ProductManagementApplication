package pm.productapp.data;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Drink extends Product {

    // Constructor that will be visible in the same package
    Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();
        return (now.isAfter(LocalTime.of(17, 30))) && now.isBefore(LocalTime.of(18, 30))
                ? super.getDiscount() : BigDecimal.ZERO;
    }

    /**
     * Overridden abstract method from parent class with new implementation
     * @param newRating - argument that will have to be produced in the method call
     * @return - new pm.productapp.data.Food object
     */
    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(getId(), getName(), getPrice(), newRating);
    }
}

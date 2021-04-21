package pm.productapp.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {

    private LocalDate bestBefore;

    // Constructor that will be visible in the same package
    Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    @Override
    public BigDecimal getDiscount() {
        return (bestBefore.isEqual(LocalDate.now())) ? super.getDiscount() : BigDecimal.ZERO;
    }

    /**
     * Overridden abstract method from parent class with new implementation
     * @param newRating - argument that will have to be produced in the method call
     * @return - new pm.productapp.data.Food object
     */
    @Override
    public Product applyRating(Rating newRating) {
        return new Food(getId(), getName(), getPrice(), newRating, getBestBefore());
    }

    @Override
    public String toString() {
        return super.toString() + ", Before: " + bestBefore;
    }
}
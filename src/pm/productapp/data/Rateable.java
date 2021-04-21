package pm.productapp.data;

@FunctionalInterface
public interface Rateable<T> {

    // By default all fields in Interface are public static final
    Rating DEFAULT_RATING = Rating.NOT_RATED;

    T applyRating(Rating rating);

    /**
     * Default method that will return default rating
     * @return - default rating
     */
    default Rating getRating() {
        return DEFAULT_RATING;
    }

    /**
     * Default method that will apply new Rating
     * @param stars - number of stars
     * @return
     */
    default T applyRating(int stars) {
        return applyRating(convert(stars));
    }

    /**
     * Static method that will convert numeric stars value to Rating enumeration value
     * @param stars - number of stars
     * @return - stars or default rating
     */
    static Rating convert(int stars) {
        // values() - returns enum objects as an array
        return (stars>=0 && stars<=5) ? Rating.values() [stars] : DEFAULT_RATING;
    }


}

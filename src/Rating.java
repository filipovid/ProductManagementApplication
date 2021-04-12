public enum Rating {

    NOT_RATED("/"),
    ONE_STAR("\u2605"),
    TWO_STAR("\u2605\u2605"),
    THREE_STAR("\u2605\u2605\u2605"),
    FOUR_STAR("\u2605\u2605\u2605\u2605"),
    FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");

    private String stars;

    Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return this.stars;
    }
}

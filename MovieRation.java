package csci1011.movierating;

/**
 *
 * @author Saviour
 */
public class MovieRation {

    public static void main(String[] args) {
        System.out.println("Movie Rating");
        
        enum MovieRating {EXCELLENT, AVERAGE, BAD}
        
        MovieRating rating = MovieRating.AVERAGE;
        switch (rating)
        {
            case EXCELLENT:
                System.out.println("You must see this movie!");
                break;
            case AVERAGE:
                System.out.println("This movie is OK, but not great.");
                break;
            case BAD:
                System.out.println("Skip it!");
                break;
            default:
                System.out.println("Something is wrong");
        }
    }
}

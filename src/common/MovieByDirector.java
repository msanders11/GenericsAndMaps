package common;

import java.util.Comparator;


/**
 *
 * @author Mike
 */
public class MovieByDirector implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getDirector().compareTo(movie2.getDirector());
    }
}

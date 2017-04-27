package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie implements Comparable  {
    private String title;
    private String director;

    public Movie() {
    }

    public Movie(String title, String director) {
//        this.title = title;
//        this.director = director;
        setTitle(title);
        setDirector(director);
    }
    
    public String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public final void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.title);
        hash = 83 * hash + Objects.hashCode(this.director);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        return true;
    }
    
 
    public int compareTo(Object other){
        
        final int BEFORE = -1;
        final int EQUALS = 0;
        final int AFTER = 1;
        
        Movie otherMovie = (Movie)other;
        
        int titleComparison = this.title.compareTo(otherMovie.title);
        int directorComparison = this.director.compareTo(otherMovie.director);
        if(titleComparison != EQUALS) return titleComparison;
        if(directorComparison != EQUALS) return directorComparison;
        
        return EQUALS;
        

//        return new CompareToBuilder()
//                .append(this.title.compareTo(otherMovie.title))
//                .append(this.director.compareTo(otherMovie.director))
//                        .toComparison();
    }

}

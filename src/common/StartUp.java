/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Mike
 */
public class StartUp {

    public static void main(String[] args) {
        Movie movie1 = new Movie("IT", "Stephen King");
        Movie movie2 = new Movie("Pulp Fiction", "Quentin Tarantino");
        Movie movie3 = new Movie("IT", "Stephen King");
        Movie movie4 = new Movie("Pulp Fiction", "Quentin Tarantino");
        Movie movie5 = new Movie("Tremors", "Ron Underwood");
        Movie movie6 = new Movie("Saving Private Ryan", "Steven Spielberg");

        Map map = new HashMap();
        map.put("IT", movie1);
        map.put("Pulp Fiction", movie2);
        map.put("IT", movie3);
        map.put("Pulp Fiction", movie4);
        map.put("Tremors", movie6);
        map.put("Saving Private Ryan", movie5);

        //Lab # 2
        //retrive by key
        Movie movie = (Movie) map.get("IT");
        System.out.println("Movie with the key of IT: " + movie);

        //repalce at a given key
        map.put("IT", movie5);

        //loop through the values
        Collection values = map.values();
        for (Object mov : values) {
            System.out.println((Movie) mov);
        }

        System.out.println("----------------------------------------------------");

        //Lab # 3
        //Store Movie objects in a TreeMap
        Map<String, Movie> map2 = new TreeMap<String, Movie>(map);

        //System.out.println(map2.values());
        //Retrieving the values in a collection
        Collection<Movie> movieValues = map2.values();

        List<Movie> sortedMovies = new ArrayList<Movie>(movieValues);

        Collections.sort(sortedMovies);
        for (Movie mov : sortedMovies) {
            System.out.println(mov);
        }

        System.out.println("----------------------------------------------------");

        //Lab # 4
        //Using Comparator to get alternate sort order: by Director
        Collection<Movie> movieValues2 = map2.values();

        List<Movie> sortedMovies2 = new ArrayList<Movie>(movieValues2);

        Collections.sort(sortedMovies2, new MovieByDirector());

        for (Movie mov : sortedMovies2) {
            System.out.println(mov);
        }

        System.out.println("----------------------------------------------------");

        //Lab # 5
        //Store in a TreeSet
        Set<Movie> set = new TreeSet<Movie>();
        set.add(movie1);
        set.add(movie2);
        set.add(movie3);
        set.add(movie4);
        set.add(movie5);
        set.add(movie6);
        
        //loop through the set and out put values
        for(Movie m: set){
            System.out.println(m);
        }
    }
}

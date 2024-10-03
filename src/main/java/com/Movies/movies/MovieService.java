package com.Movies.movies;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    private final String API_URL = "https://api.themoviedb.org/3/movie/12?api_key=92d9840fcfd84ee2adfb5575937ca20e";
    public Movie getMovieData() {
        RestTemplate restTemplate = new RestTemplate();
        Movie movie;
        movie = restTemplate.getForObject(API_URL, Movie.class);
        return movie;
    }
}
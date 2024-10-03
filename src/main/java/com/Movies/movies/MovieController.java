package com.Movies.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/fetch")
    public ResponseEntity<Movie> fetchAndSaveMovie() {
        Movie movie = movieService.getMovieData();
        return ResponseEntity.ok(movie);
    }
    @GetMapping("/") // Mapeo para la raíz
    public String welcome() {
        return "Bienvenido a la API de películas. Usa /api/movies/fetch/{id} para obtener detalles de una película.";
    }
}
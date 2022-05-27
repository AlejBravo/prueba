package com.example.pruebamovies.controller;

import com.example.pruebamovies.model.Movie;
import com.example.pruebamovies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/lista")
    public List<Movie> findAllMovies() {
        return movieService.getMovies();
    }

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

    @PostMapping("/updateMovie")
    public Movie updateMovie(@RequestBody Movie movie){
        return movieService.updateMovie(movie);
    }

    @GetMapping("/{id}")
    public Optional<Movie> getMovieById(@PathVariable int id){
        return movieService.findById(id);
    }
}

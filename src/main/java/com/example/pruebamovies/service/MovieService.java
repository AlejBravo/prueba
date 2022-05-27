package com.example.pruebamovies.service;

import com.example.pruebamovies.model.Movie;
import com.example.pruebamovies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Autowired
    MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    /*public Movie updateMovie(Integer id, Movie movie) {
        Optional<Movie> movieAct = movieRepository.findById(id);
        if (movieAct.isPresent()) {
            Movie mov = movieAct.get();
            mov.setDirector();
            return crear(tmp);
        }
        return null;*/

    public Optional<Movie> findById(int id) {
        return movieRepository.findById(id);
    }
}

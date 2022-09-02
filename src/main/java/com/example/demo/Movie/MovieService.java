package com.example.demo.Movie;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Movie getByImdbId(String imdbId) {
        Optional<Movie> movieOptional = movieRepository.findByImdbId(imdbId);
        return movieOptional.orElseThrow();
    }
}

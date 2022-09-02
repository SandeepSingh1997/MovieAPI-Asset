package com.example.demo.Movie;


import com.example.demo.MovieDbApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.*;

public class MovieServiceTest {

    private MovieService movieService;

    private MovieRepository movieRepository;

    @BeforeEach
    public void beforeEach(){
        this.movieRepository = mock(MovieRepository.class);
        this.movieService = new MovieService(movieRepository);
    }

    @Test
    public void shouldReturnAMovieWhenItsIdIsGiven(){
        Movie movie = mock(Movie.class);
        when(movieRepository.findByImdbId("movie_id")).thenReturn(Optional.ofNullable(movie));

        movieService.getByImdbId("movie_id");

        verify(movieRepository).findByImdbId("movie_id");
    }
}

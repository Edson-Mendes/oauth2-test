package br.com.emendes.oauth2test.controller;

import br.com.emendes.oauth2test.model.Movie;
import br.com.emendes.oauth2test.service.MovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController {

  private final MovieService movieService;

  @GetMapping
  public ResponseEntity<List<Movie>> findAll() {
    List<Movie> movies = movieService.findAll();
    return ResponseEntity.ok(movies);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Movie> findById(@PathVariable long id){

    Movie movie = movieService.findById(id);

    return ResponseEntity.ok(movie);
  }

}

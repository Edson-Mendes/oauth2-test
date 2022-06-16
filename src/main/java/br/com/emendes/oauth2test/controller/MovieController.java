package br.com.emendes.oauth2test.controller;

import br.com.emendes.oauth2test.model.Movie;
import br.com.emendes.oauth2test.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

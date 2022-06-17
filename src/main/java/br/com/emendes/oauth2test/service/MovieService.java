package br.com.emendes.oauth2test.service;

import br.com.emendes.oauth2test.exception.ResourceNotFoundException;
import br.com.emendes.oauth2test.model.Movie;
import br.com.emendes.oauth2test.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MovieService {

  private final MovieRepository movieRepository;

  public List<Movie> findAll() {
    return movieRepository.findAll();
  }

  public Movie findById(long id) {
    Optional<Movie> optionalMovie = movieRepository.findById(id);

    return optionalMovie.orElseThrow(() -> new ResourceNotFoundException("movie not found"));
  }
}

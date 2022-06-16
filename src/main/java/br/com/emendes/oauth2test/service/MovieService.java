package br.com.emendes.oauth2test.service;

import br.com.emendes.oauth2test.model.Movie;
import br.com.emendes.oauth2test.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MovieService {

  private final MovieRepository movieRepository;

  public List<Movie> findAll() {
    return movieRepository.findAll();
  }
}

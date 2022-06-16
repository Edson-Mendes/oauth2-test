package br.com.emendes.oauth2test.repository;

import br.com.emendes.oauth2test.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

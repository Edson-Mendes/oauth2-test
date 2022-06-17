package br.com.emendes.oauth2test.handler;

import br.com.emendes.oauth2test.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResourceNotFoundHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<String> handle(ResourceNotFoundException ex){
    return ResponseEntity.badRequest().body(ex.getMessage());
  }

}

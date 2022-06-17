package br.com.emendes.oauth2test.controller;

import br.com.emendes.oauth2test.controller.dto.LoginModeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login-mode")
public class LoginModeController {

  @GetMapping
  public ResponseEntity<List<LoginModeDto>> findLoginModes(){
    LoginModeDto github = new LoginModeDto("http://localhost:8080/oauth2/authorization/github");

    return ResponseEntity.ok(List.of(github));
  }

}

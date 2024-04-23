package br.com.michael.gestaovagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.michael.gestaovagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  @PostMapping("/")
  public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
    System.out.println("Candidato");
    System.out.println(candidateEntity.getEmail());
  }
}

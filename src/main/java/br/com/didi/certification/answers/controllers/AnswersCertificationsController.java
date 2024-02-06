package br.com.didi.certification.answers.controllers;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONWrappedObject;

@RestController
@RequestMapping(value = "answers", produces = MediaType.APPLICATION_JSON_VALUE)
public class AnswersCertificationsController {
  
  @GetMapping("")
  public ResponseEntity<Object> getAllAnswers() {
    return ResponseEntity.status(200).body(new ArrayList<JSONWrappedObject>());
  }
}

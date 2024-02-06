package br.com.didi.certification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {
  
  @GetMapping("")
  public String returnPong() {
    return "pong";
  }

}

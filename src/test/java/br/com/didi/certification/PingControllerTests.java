package br.com.didi.certification;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class PingControllerTests {

  @Autowired
  MockMvc mockMvc;

  @Test
  void returnPong() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/ping")).andExpect(status().isOk()).andExpect(content().string("pong"));
  }
}

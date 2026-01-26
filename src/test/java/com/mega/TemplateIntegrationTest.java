package com.mega;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@Tag("integration")
class TemplateIntegrationTest extends AbstractIntegrationTest {

  private final MockMvc mockMvc;

  TemplateIntegrationTest(MockMvc mockMvc) {
    this.mockMvc = mockMvc;
  }

  @Test
  void getWidgetById_ShouldReturnWidget_WhenIdAndAuthorMatches() throws Exception {
    mockMvc
        .perform(get("/"))
        .andExpect(status().is2xxSuccessful())
        .andExpect(content().string("Template Service is Up and Running"));
  }
}

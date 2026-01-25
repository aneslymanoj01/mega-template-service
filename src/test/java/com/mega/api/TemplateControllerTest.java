package com.mega.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TemplateControllerTest {

  @InjectMocks private TemplateController templateController;

  @Test
  void getTemplate_ShouldReturnStringResponse_WhenGetTemplateCalled() {
    String actualResponse = templateController.getTemplate().getBody();
    assertEquals("Template Service is Up and Running", actualResponse);
  }
}

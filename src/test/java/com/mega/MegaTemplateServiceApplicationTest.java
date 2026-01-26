package com.mega;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;

class MegaTemplateServiceApplicationTest {

  @Test
  void constructor_ShouldCreateInstance() {
    MegaTemplateServiceApplication app = new MegaTemplateServiceApplication();
    assertNotNull(app);
  }

  @Test
  void main_ShouldRunSpringApplication() {
    try (var mockStatic = mockStatic(SpringApplication.class)) {
      MegaTemplateServiceApplication.main(new String[] {});
      mockStatic.verify(
          () -> SpringApplication.run(MegaTemplateServiceApplication.class, new String[] {}));
    }
  }
}

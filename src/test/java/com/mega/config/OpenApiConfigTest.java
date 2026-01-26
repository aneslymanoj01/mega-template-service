package com.mega.config;

import static org.junit.jupiter.api.Assertions.*;

import io.swagger.v3.oas.models.OpenAPI;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OpenApiConfigTest {

  @InjectMocks private OpenApiConfig openApiConfig;

  @Test
  void customOpenAPI_ShouldReturnOpenAPIWithInfo() {
    OpenAPI openAPI = openApiConfig.customOpenAPI();

    assertNotNull(openAPI);
    assertNotNull(openAPI.getInfo());
    assertEquals("Mega Template Service API", openAPI.getInfo().getTitle());
    assertEquals("1.0", openAPI.getInfo().getVersion());
    assertEquals("API documentation for Mega Template Service", openAPI.getInfo().getDescription());
  }
}

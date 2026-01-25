package com.mega.api;

import static org.apache.tomcat.util.http.Method.GET;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

  @Operation(
      summary = "Get template status",
      description = "Returns the service status",
      method = GET)
  @GetMapping
  public ResponseEntity<String> getTemplate() {
    return ResponseEntity.ok("Template Service is Up and Running");
  }
}

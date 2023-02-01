package mcl.front.web.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
  @Bean
  public OpenAPI springBlogPessoalOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Primeiro Projeto com Swagger")
            .description(" - Documentando API Rest com Swagger usando Spring Boot Framework 3.0.2")
            .version("v0.0.1")
            .license(new License()
                .name("Web Project with Spring Boot Web")
                .url("https://github.com/marcelovieiradesousa/spring-boot"))
            .contact(new Contact()
                .name("Marcelo Vieira")
                .url("https://www.linkedin.com/in/marcelo-vieira-sousa/")
                .email("marcelovieira.tec@gmail.com")))
        .externalDocs(new ExternalDocumentation()
            .description("My Github")
            .url("https://github.com/marcelovieiradesousa"));
  }
}

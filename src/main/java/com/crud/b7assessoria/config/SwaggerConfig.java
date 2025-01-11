package com.crud.b7assessoria.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Value("${api.security.token.secret}")
    private String secret;

    @Bean
    public OpenAPI defaultOpenAPI() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("B7 Assessoria");

        Contact contact = new Contact();
        contact.setName("Henrique Sena");
        contact.setUrl("https://github.com/HenriqueGSena");

        Info info = new Info()
                .title("Api B7 Assessoria")
                .version("1.0.0")
                .description("The goal is to build a Rest API for product management. You should use Java, Spring Boot, and a relational database of your choice. You can use any other libraries/tools that help in the development of the test.")
                .contact(contact);

        SecurityScheme securityScheme = new SecurityScheme()
                .name("Authorization")
                .type(SecurityScheme.Type.APIKEY)
                .in(SecurityScheme.In.HEADER)
                .scheme("bearer")
                .bearerFormat("JWT");

        SecurityRequirement securityRequirement = new SecurityRequirement()
                .addList("Authorization");

        return new OpenAPI()
                .info(info)
                .servers(List.of(server))
                .components(new io.swagger.v3.oas.models.Components().addSecuritySchemes("Authorization", securityScheme))
                .security(List.of(securityRequirement));
    }
}

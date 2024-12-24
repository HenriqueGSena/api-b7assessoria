package com.crud.b7assessoria.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI defaultOpenAPI() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("B7 Assessoria");

        Contact contact = new Contact();
        contact.setName("Henrique Sena");
        contact.setUrl("https://henriquegsena.github.io/");

        Info info = new Info()
                .title("Api B7 Assessoria")
                .version("1.0.0")
                .description("The goal is to build a Rest API for product management. You should use Java, Spring Boot, and a relational database of your choice. You can use any other libraries/tools that help in the development of the test.")
                .contact(contact);
        return  new OpenAPI().info(info).servers(List.of(server));
    }
}

package com.example.passin.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocApiConfig {

    @Bean
    public OpenAPI openApi(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Criação de eventos e participantes")
                                .description("API responsável por administrar a criação de evento, com suas respectivas características e posteriormente fazer a criação de um participante para esse evento.")
                                .contact(new Contact().name("Arthur Talles Alves").email("arthur.tallesa@gmail.com"))
                );
    }
}

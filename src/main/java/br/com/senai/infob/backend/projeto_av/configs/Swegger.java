package br.com.senai.infob.backend.projeto_av.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "projeto-av",
        version = "1.0",
        description = "api para teste de um av"
    )
)
public class Swegger {

}
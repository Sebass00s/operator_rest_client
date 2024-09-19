package ar.edu.tecnica29de6.turnos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableTransactionManagement
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    // Esta configuración desactiva el manejo automático de recursos estáticos
}

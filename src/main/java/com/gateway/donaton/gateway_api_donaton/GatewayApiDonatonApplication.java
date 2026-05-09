package com.gateway.donaton.gateway_api_donaton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApiDonatonApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApiDonatonApplication.class, args);
    }}

// @Bean
/* public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    return builder.routes()
            // RUTA LOGÍSTICA
            .route("logistica-api", r -> r.path("/logistica/**")
                    .filters(f -> f.stripPrefix(1))
                    .uri("http://logistica-service:3001"))
            // RUTA DONACIONES
            .route("donaciones-api", r -> r.path("/donaciones/**")
                    .filters(f -> f.stripPrefix(1))
                    .uri("http://donaciones-service:3002"))
            // RUTA NECESIDADES
            .route("necesidades-api", r -> r.path("/necesidades/**")
                    .filters(f -> f.stripPrefix(1))
                    .uri("http://necesidades-service:3003"))
            .build();
}
}*/
package com.axyya.flightbookinggateway.configuration;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApplication {

    @Bean
    public RouteLocator gatewayRoute(RouteLocatorBuilder builder)
    {
        return builder.routes().route(o -> o.path("/flight/**")
                .uri("http://localhost:1015")
        )
                .route(o -> o.path("/passenger/**")
                        .uri("http://localhost:1012"))
                .route(o -> o.path("/booking/**")
                .uri("http://localhost:1013"))
                .build();
    }
}

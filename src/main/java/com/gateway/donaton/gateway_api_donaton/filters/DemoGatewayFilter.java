package com.gateway.donaton.gateway_api_donaton.filters;


import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;



@Component
public class DemoGatewayFilter extends AbstractGatewayFilterFactory {

    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {
            ServerHttpRequest req = exchange.getRequest();
            System.out.println("test filter please log");
            System.out.println("URL please be " + req.getPath());
            System.out.println(req.getHeaders().containsKey(HttpHeaders.AUTHORIZATION));

            return chain.filter(exchange);
        };
    }

}

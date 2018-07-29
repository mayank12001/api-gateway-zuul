package com.gateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.gateway.filters.SimplePreFilter;

@EnableZuulProxy
@SpringBootApplication

public class GatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
  }

  @Bean
  public SimplePreFilter simpleFilter() {
    return new SimplePreFilter();
  }
}
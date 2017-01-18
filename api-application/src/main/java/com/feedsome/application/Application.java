package com.feedsome.application;

import com.feedsome.api.rest.RestConfiguration;
import com.feedsome.api.ws.WebSocketConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        RestConfiguration.class,
        WebSocketConfiguration.class
})
@EnableEurekaServer
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(Application.class);
    }

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

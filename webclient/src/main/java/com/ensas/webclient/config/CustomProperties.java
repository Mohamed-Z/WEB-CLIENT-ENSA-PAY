package com.ensas.webclient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.ensas.webclient")
public class CustomProperties {

    String apiUrl;

}

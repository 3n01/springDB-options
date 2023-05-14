package com.neol.springjdbcdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class DatasourceProperties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}

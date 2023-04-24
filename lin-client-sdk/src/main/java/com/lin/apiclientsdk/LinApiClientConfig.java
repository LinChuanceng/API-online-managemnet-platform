package com.lin.apiclientsdk;

import com.lin.apiclientsdk.client.LinApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("linapi.client")
@Data
@ComponentScan
public class LinApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public LinApiClient linApiClient() {
        return new LinApiClient(accessKey, secretKey);
    }

}

package ru.digitalleague.gatewaydemo.logservice.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;

@Configuration
@RequiredArgsConstructor
public class ActuatorConfig {

    public static final String UNKNOWN = "unknown";

    @Bean
    public InfoContributor infoContributor() {
        return builder -> {
            try {
                builder.withDetail("hostname", InetAddress.getLocalHost().getHostName());
            } catch (Exception e) {
                builder.withDetail("hostname", UNKNOWN);
            }
        };
    }
}

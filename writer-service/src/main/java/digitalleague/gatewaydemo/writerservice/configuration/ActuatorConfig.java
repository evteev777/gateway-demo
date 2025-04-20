package digitalleague.gatewaydemo.writerservice.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;

@Configuration
public class ActuatorConfig {

    public static final String UNKNOWN = "unknown";

    @Value("${spring.application.name:writer-service}")
    private String applicationName;

    @Bean
    public InfoContributor infoContributor() {
        return builder -> {
            try {
                builder
                    .withDetail("applicationName", applicationName)
                    .withDetail("hostname", InetAddress.getLocalHost().getHostName());
            } catch (Exception e) {
                builder
                    .withDetail("applicationName", applicationName)
                    .withDetail("hostname", UNKNOWN);
            }
        };
    }
}

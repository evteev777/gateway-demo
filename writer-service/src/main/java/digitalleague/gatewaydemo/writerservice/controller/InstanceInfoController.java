package digitalleague.gatewaydemo.writerservice.controller;

import digitalleague.gatewaydemo.writerservice.client.LoggerServiceClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/v1/info")
@RequiredArgsConstructor
public class InstanceInfoController {

    public static final String UNKNOWN = "unknown";

    private final LoggerServiceClient loggerServiceClient;

    @GetMapping("/instance-name")
    public Map<String, String> getInstanceName() {
        try {
            log.info("GET    /writer/api/v1/info/instance-name");

            String hostName = InetAddress.getLocalHost().getHostName();
            loggerServiceClient.logHostname(hostName);

            return Map.of("instanceName", hostName);
        } catch (UnknownHostException e) {
            return Map.of("instanceName", UNKNOWN);
        }
    }
}

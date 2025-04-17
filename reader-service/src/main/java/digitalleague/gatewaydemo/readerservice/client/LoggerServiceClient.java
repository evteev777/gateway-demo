package digitalleague.gatewaydemo.readerservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${client.logger-service.name}", path = "${client.logger-service.path.internal.v1}")
public interface LoggerServiceClient {

    @PostMapping("/log-hostname")
    void logHostname(@RequestParam("hostname") String hostName);
}

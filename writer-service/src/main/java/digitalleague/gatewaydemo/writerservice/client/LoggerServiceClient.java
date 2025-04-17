package digitalleague.gatewaydemo.writerservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "logClient", url = "${client.logger-service.url}")
public interface LoggerServiceClient {

    @PostMapping("/log-hostname")
    void logHostname(@RequestParam("hostname") String hostName);
}

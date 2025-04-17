package digitalleague.gatewaydemo.writerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WriterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WriterServiceApplication.class, args);
    }
}

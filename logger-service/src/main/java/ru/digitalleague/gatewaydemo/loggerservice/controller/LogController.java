package ru.digitalleague.gatewaydemo.loggerservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/internal/v1")
public class LogController {

    @PostMapping("/log-hostname")
    public void logRequest(@RequestParam("hostname") String hostName) {
        log.info("POST   /logger/internal/v1/log-hostname?hostname={}", hostName);
    }
}

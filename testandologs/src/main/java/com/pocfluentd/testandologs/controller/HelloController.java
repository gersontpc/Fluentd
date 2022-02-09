package com.pocfluentd.testandologs.controller;

import com.pocfluentd.testandologs.TestandologsApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello() {
        log.info("Você chamou a aplicação!");
        return "Aplicação Onlineeee!!!";
    }

}

package com.pocfluentd.testandologs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestandologsApplication {
private static Logger log = LoggerFactory.getLogger(TestandologsApplication.class);

	public static void main(String[] args) {
		log.info("Iniciando a aplicação!");
		SpringApplication.run(TestandologsApplication.class, args);
		log.info("Aplicação pronta para uso!");
	}

}

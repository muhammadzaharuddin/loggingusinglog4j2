package com.example.loggingusinglog4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class LoggingUsingLog4j2Application {

	public static void main(String[] args) {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "prod");
		SpringApplication.run(LoggingUsingLog4j2Application.class, args);
	}

}

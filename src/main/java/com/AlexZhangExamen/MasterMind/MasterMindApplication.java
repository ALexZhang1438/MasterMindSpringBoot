package com.AlexZhangExamen.MasterMind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.AlexZhangExamen.*"})
public class MasterMindApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterMindApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MasterMindApplication.class);
	}
}

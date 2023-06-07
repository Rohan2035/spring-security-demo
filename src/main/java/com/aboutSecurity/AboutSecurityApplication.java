package com.aboutSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aboutSecurity")
public class AboutSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AboutSecurityApplication.class, args);
	}

}

package com.ReactMacOs.ReactMacOs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory;

@SpringBootApplication
public class ReactMacOsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactMacOsApplication.class, args);
	}
}

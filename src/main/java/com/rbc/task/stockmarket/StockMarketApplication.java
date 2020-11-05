package com.rbc.task.stockmarket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Main spring boot application start up class
 * 
 * @author Radha
 *
 */
@SpringBootApplication
@EnableSwagger2
public class StockMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketApplication.class, args);

	}

}

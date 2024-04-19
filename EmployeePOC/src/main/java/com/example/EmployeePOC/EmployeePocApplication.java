package com.example.EmployeePOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@ComponentScan(basePackages = "com.example")
@EntityScan("com.example.EmployeePOC.Model")
@EnableJpaRepositories(basePackages = "com.example.EmployeePOC.Repository")
@PropertySources({@PropertySource({"file://Users//nishakumari//Downloads//EmployeePOC//src//main//resources//application.properties"})})*/
public class EmployeePocApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePocApplication.class, args);
	}

}

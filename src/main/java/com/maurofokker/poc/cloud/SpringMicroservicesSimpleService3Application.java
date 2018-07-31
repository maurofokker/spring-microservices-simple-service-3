package com.maurofokker.poc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMicroservicesSimpleService3Application {

	@RequestMapping("/service")
    public String service() {
	    return "simple service 3 called";
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesSimpleService3Application.class, args);
	}
}

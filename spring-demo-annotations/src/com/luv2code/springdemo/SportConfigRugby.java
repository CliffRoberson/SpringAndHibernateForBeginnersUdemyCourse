package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfigRugby {
	
	// define bean for sad fortune service
	@Bean
	public FortuneService blahFortuneService() {
		return new BlahFortuneService();
	}
	
	// define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new RugbyCoach(blahFortuneService());
	}
}

package com.fishermenz.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(value = { @PropertySource("classpath:application.properties") })
@ComponentScan(basePackages = { "com.fishermenz.web.service" })
@Import({SecurityConfig.class})
public class AppConfig {
	
}

package com.fishermenz.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 
 * @author yogans_s
 * Appconfig is a spring container configuration class and a replacement for xml file configuration
 * All configurations will be loaded in spring container when the application is started.
 *
 */

@Configuration
@PropertySources(value = { @PropertySource("classpath:application.properties") })
@ComponentScan(basePackages = { "com.fishermenz.services"})
@Import({SecurityConfig.class, MongoConfig.class})
public class AppConfig {
	
}

package com.fishermenz.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * 
 * @author yogans_s
 * MongoConfig is a configuration class, contains information required to connect 
 * the MongoDB
 *
 */

@Configuration
@EnableMongoRepositories(basePackages= {"com.fishermenz.repositories"})
@PropertySources(value = { @PropertySource("classpath:application.properties") })
public class MongoConfig extends AbstractMongoConfiguration {
	
	public static final String BASE_PACKAGES = "com.fishermenz.entities";
	public static final Logger logger = LoggerFactory.getLogger(MongoConfig.class);
	
	@Value("${mongo.server}")
	private String mongoServer;
	
	@Value("${mongo.port}")
	private Integer mongoPort;
	
	@Value("${mongo.database}")
	private String mongoDB;

	@Override
	protected String getDatabaseName() {
		return mongoDB;
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient(mongoServer, mongoPort);
	}
	
	@Override
	protected String getMappingBasePackage() {
		return BASE_PACKAGES;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
	  return new PropertySourcesPlaceholderConfigurer();
	 }
}

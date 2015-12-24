package com.fishermenz.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.fishermenz.web.controllers" })
public class WebConfig {

}

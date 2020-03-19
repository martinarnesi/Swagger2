package com.arnesi.swagger.swaggerdemo.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class) //Bean Validations
public class SpringFoxConfig {    
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  					// Builder
          .select()                                  
          .apis(RequestHandlerSelectors
        		  .basePackage("com.arnesi.swagger.swaggerdemo.controller")) // Filtering API for Swagger’s Response            
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());   											// Custom Information                                        
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "Rosario Java Community - Swagger2", 
          "Swagger 2 for a Springboot REST web service with a simple description of API.", 
          "ENDAVA", 
          "Terms of service", 
          new Contact("Martin Arnesi", "www.endava.com", "martin.arnesi@endava.com"), 
          "License of API", "API license URL", Collections.emptyList());
    }
}

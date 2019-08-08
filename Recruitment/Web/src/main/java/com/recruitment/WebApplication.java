package com.recruitment;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * since basePackage includes com.apiDemo.* and api module is imported, api components will also be invoked.
 */

@Configuration
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {

	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebApplication.class, args);
	}
	
	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	
	
}

	


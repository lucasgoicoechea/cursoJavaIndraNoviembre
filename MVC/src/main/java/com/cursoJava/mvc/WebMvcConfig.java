package com.cursoJava.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

@Controller
public class WebMvcConfig {
	
	@Bean
	public ThymeleafViewResolver viewResolver() {
		
	ThymeleafViewResolver viewResolver = 
			new ThymeleafViewResolver();
	SpringResourceTemplateResolver templateResolver =
			new SpringResourceTemplateResolver();
	
	templateResolver.setPrefix("classpath:/views");
	templateResolver.setSuffix(".html");
	
	SpringTemplateEngine templateEngine = 
			new SpringTemplateEngine();
	templateEngine.setTemplateResolver(
			templateResolver);
	viewResolver.setTemplateEngine(templateEngine);
	return viewResolver;
	}

}

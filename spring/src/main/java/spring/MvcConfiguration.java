package spring;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

@Configuration
public class MvcConfiguration {
	
	@Bean
	public HttpMessageConverters customConverters() {
	HttpMessageConverter<?> first = null;
	HttpMessageConverter<?> second = null;
	return new HttpMessageConverters(first, second);
	}


}

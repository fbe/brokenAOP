package name.felixbecker.brokenaop.configuration;

import name.felixbecker.brokenaop.aspects.WorkingAspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfig.class)
public class WorkingConfig {
	
	@Bean
	public WorkingAspect workingAspect(){
		return new WorkingAspect();
	}
}

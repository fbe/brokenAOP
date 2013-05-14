package name.felixbecker.brokenaop.configuration;

import name.felixbecker.brokenaop.aspects.BrokenAspect;
import name.felixbecker.brokenaop.aspects.WorkingAspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(WorkingAspect.class)
public class BrokenConfig {
	
	@Bean
	public BrokenAspect brokenAspect(){
		return new BrokenAspect();
	}
}

package name.felixbecker.brokenaop;

import static org.junit.Assert.assertEquals;
import name.felixbecker.brokenaop.configuration.AppConfig;
import name.felixbecker.brokenaop.configuration.WorkingConfig;
import name.felixbecker.brokenaop.services.TweetService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class BrokenAOPTest {

	
	@Test
	public void testWorkingAspect(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(WorkingConfig.class);
		TweetService tweetService = ctx.getBean(TweetService.class);
		assertEquals(0, tweetService.getAllTweets().size());
	}
	
	@Test
	public void testNonWorkingAspect(){
	
	}
	
}

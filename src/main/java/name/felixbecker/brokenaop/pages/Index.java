package name.felixbecker.brokenaop.pages;

import java.util.List;

import name.felixbecker.brokenaop.entities.TweetBO;
import name.felixbecker.brokenaop.services.TweetService;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;


public class Index {
	
	@Inject
	private TweetService tweetService;
	
	@Property
	private TweetBO currentTweet;
	
	public List<TweetBO> getAllTweets() {
		return tweetService.getAllTweets();
	}
	
}

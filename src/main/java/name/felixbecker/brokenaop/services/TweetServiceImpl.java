package name.felixbecker.brokenaop.services;

import java.util.List;

import name.felixbecker.brokenaop.entities.TweetBO;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TweetServiceImpl implements TweetService {

	@Autowired
	protected SessionFactory sessionFactory;

	public List<TweetBO> getAllTweets() {
		return sessionFactory.getCurrentSession().createCriteria(TweetBO.class).addOrder(Order.desc("created")).list();
	}
}

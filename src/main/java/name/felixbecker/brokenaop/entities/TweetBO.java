package name.felixbecker.brokenaop.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class TweetBO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "issueId")
	private Long id;
	
	@Column(name = "issue")
	@Lob
	private String tweetText;

	@Temporal(TemporalType.TIMESTAMP)
	protected Date created = new Date();

	@Version
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastUpdate = new Date();

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTweetText() {
		return tweetText;
	}

	public void setTweetText(String tweetText) {
		this.tweetText = tweetText;
	}
}

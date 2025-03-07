package timothee_macedo.controle_api.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "messages")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String authorName;
	private String content;
	
	@OneToOne
    @JoinColumn(name = "quote_id", referencedColumnName = "id")
	private Quote quote;
	
	@Column(nullable = false)
    private LocalDateTime timestamp;
	
	public Message() {
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	@JsonCreator
	public Message(
			@JsonProperty("authorName") String authorName,
			@JsonProperty("content") String content,
			@JsonProperty("quote") Quote quote
			) {
		this.authorName = authorName;
		this.content = content;
		this.setQuote(quote);
		this.timestamp = LocalDateTime.now();
	}


	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

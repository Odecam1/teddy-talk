package timothee_macedo.controle_app.model;

import java.time.LocalDateTime;

public class Message {
	private String authorName;
	private String content;
	private Quote quote;
    private LocalDateTime timestamp;
	
	public Message(String authorName, String content, Quote quote, LocalDateTime timestamps) {
		this.authorName = authorName;
		this.content = content;
		this.quote = quote;
		this.timestamp = timestamps;
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

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}

package timothee_macedo.controle_app.dto;

public class MessageSendDTO {

	private String authorName;
	private String content;
		
	public MessageSendDTO(String authorName, String content) {
		this.authorName = authorName;
		this.content = content;
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

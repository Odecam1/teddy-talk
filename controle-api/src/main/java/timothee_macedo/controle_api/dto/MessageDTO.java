package timothee_macedo.controle_api.dto;

public class MessageDTO {
    private String authorName;
    private String content;
    private Integer quoteId;
    
    public MessageDTO(String authorName, String content, Integer quoteId) {
    	this.authorName	= authorName;
    	this.content = content;
    	this.quoteId = quoteId;
	}

    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Integer getQuoteId() { return quoteId; }
    public void setQuoteId(Integer quoteId) { this.quoteId = quoteId; }
}


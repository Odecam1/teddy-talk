package timothee_macedo.controle_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import timothee_macedo.controle_api.model.Message;
import timothee_macedo.controle_api.repo.MessageRepository;

@Service
public class MessageService {
	private MessageRepository messageRepository;
	private QuoteService quoteService;


	public MessageService(MessageRepository messageRepository, QuoteService quoteService) {
		this.messageRepository = messageRepository;	
		this.quoteService = quoteService;
	}

	public List<Message> getAllMessages()  {
		return messageRepository.findAll();
	}
	
	public Message addMessageWithRandomQuote(String authorName, String content) {
		Message message = new Message();
		message.setAuthorName(authorName);
		message.setContent(content);
		message.setQuote(quoteService.getRandomQuote());

		return messageRepository.save(message);
	}

}

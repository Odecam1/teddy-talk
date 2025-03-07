package timothee_macedo.controle_app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import timothee_macedo.controle_app.dto.MessageSendDTO;
import timothee_macedo.controle_app.model.Message;

@Service
public class MessageService {

    private final RestTemplate restTemplate;

    public MessageService() {
		this.restTemplate = new RestTemplate();
	}

    public MessageService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Message> getMessages() {
        String url = "http://localhost:8080/message";
        Message[] usersArray = restTemplate.getForObject(url, Message[].class);
        return Arrays.asList(usersArray);
    }
    
    public Message addMessageWithRandomQuote(Message message) {
        String url = "http://localhost:8080/message";
    	return restTemplate.postForObject(url, new MessageSendDTO(message.getAuthorName(), message.getContent()) , Message.class);
    }
}


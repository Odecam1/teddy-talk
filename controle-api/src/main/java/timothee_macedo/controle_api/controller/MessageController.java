package timothee_macedo.controle_api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import timothee_macedo.controle_api.model.Message;
import timothee_macedo.controle_api.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {
	MessageService messageService;

	public MessageController (MessageService messageService) {
		this.messageService = messageService;
	}

	@GetMapping
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}

	@PostMapping
	public ResponseEntity<Message> addMessage(
			@RequestParam String authorName,
			@RequestParam String content
	) {
		Message message = messageService.addMessageWithRandomQuote(authorName,content);
		return ResponseEntity.status(HttpStatus.CREATED).body(message);
	}
}

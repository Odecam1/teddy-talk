package timothee_macedo.controle_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import timothee_macedo.controle_app.model.Message;
import timothee_macedo.controle_app.model.Quote;
import timothee_macedo.controle_app.service.MessageService;

@Controller
public class MessageController {
	
	MessageService messageService;

	public MessageController(MessageService messageService) {
		this.messageService = messageService;
	}

	@GetMapping("/message")
	public String getMessage(Model model) {
		model.addAttribute("message", new Message("", "", new Quote(), null));
		return "message";
	}
	
	@PostMapping("/message")
	public String addArtiste(Model model, 
			@RequestParam String authorName, 
			@RequestParam String content
			) {
		Message messageRandom = messageService.addMessageWithRandomQuote(new Message(authorName, content, null, null));
		model.addAttribute("message", messageRandom);
		return "message";
	}
	
	
	
}

package timothee_macedo.controle_app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import timothee_macedo.controle_app.model.Message;
import timothee_macedo.controle_app.service.MessageService;

@Controller
public class AdminController {
	
	MessageService messageService;

	public AdminController(MessageService messageService) {
		this.messageService = messageService;
	}

	
	
	@GetMapping("/admin")
	public String getAdmin(Model model) {
		List<Message> messages = messageService.getMessages();
		model.addAttribute("listMessages", messages);
		return "admin";
	}
		
	
}

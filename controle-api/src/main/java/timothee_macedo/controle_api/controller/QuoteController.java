package timothee_macedo.controle_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import timothee_macedo.controle_api.model.Quote;
import timothee_macedo.controle_api.service.QuoteService;

@RestController
public class QuoteController {
	QuoteService quoteService;

	public QuoteController(QuoteService quoteService) {
		this.quoteService = quoteService;
	}

	@GetMapping("/quote")
	public List<Quote> getQuotes() {
		return quoteService.getAllQuotes();
	}

	@PostMapping("/quote")
	public Quote addQuote(@RequestBody Quote newQuote) {
		quoteService.addQuote(newQuote);
		return newQuote;
	}
}

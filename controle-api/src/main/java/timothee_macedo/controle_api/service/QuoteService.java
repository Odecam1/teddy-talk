package timothee_macedo.controle_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import timothee_macedo.controle_api.model.Quote;
import timothee_macedo.controle_api.repo.QuoteRepository;

@Service
public class QuoteService {
	private QuoteRepository quoteRepository;

	public QuoteService(QuoteRepository quoteRepository) {
		this.quoteRepository = quoteRepository;	
	}
	
	public List<Quote> getAllQuotes()  {
		return quoteRepository.findAll();
	}

	public void addQuote(Quote quote) {
		quoteRepository.save(quote);
	}

	public Quote findById(Integer quoteId) {
		return quoteRepository.findById(quoteId)
                .orElseThrow(() -> new RuntimeException("Quote not found with ID: " + quoteId));
	}

}

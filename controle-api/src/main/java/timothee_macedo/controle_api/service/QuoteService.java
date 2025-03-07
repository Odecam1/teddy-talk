package timothee_macedo.controle_api.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import timothee_macedo.controle_api.model.Quote;
import timothee_macedo.controle_api.repo.QuoteRepository;

@Service
public class QuoteService {
	private QuoteRepository quoteRepository;
	private final Random random = new Random();

	public QuoteService(QuoteRepository quoteRepository) {
		this.quoteRepository = quoteRepository;	
	}
	
	public List<Quote> getAllQuotes()  {
		return quoteRepository.findAll();
	}
	public Quote getRandomQuote()  {
		List<Quote> allQuotes = getAllQuotes();
		
		return allQuotes.get(random.nextInt(allQuotes.size()));
	}

	public void addQuote(Quote quote) {
		quoteRepository.save(quote);
	}

	public Quote findById(Integer quoteId) {
		return quoteRepository.findById(quoteId)
                .orElseThrow(() -> new RuntimeException("Quote not found with ID: " + quoteId));
	}

}

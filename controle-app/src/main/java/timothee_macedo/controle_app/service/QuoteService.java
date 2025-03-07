package timothee_macedo.controle_app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import timothee_macedo.controle_app.model.Quote;

@Service
public class QuoteService {

    private final RestTemplate restTemplate;
    
    public QuoteService() {
		this.restTemplate = new RestTemplate();
	}


    public QuoteService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Quote> getQuotes() {
        String url = "http://localhost:8080/quote";
        Quote[] usersArray = restTemplate.getForObject(url, Quote[].class);
        return Arrays.asList(usersArray);
    }
    
    public Quote getRandomQuote() {
        String url = "http://localhost:8080/quote/random";
    	return restTemplate.getForObject(url, Quote.class);
    }
}


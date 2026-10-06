package com.example.randomduck;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class DuckClient {
	    private final RestClient restClient;

	    public DuckClient() {
	        this.restClient = RestClient.create();
	    }
	    
	    public DuckResponse getRandomDuck() {
	        return restClient
	                .get()
	                .uri("https://random-d.uk/api/random")
	                .retrieve()
	                .body(DuckResponse.class);
	    }
	}

package com.example.randomduck;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
	public class DuckController {
	
	private final DuckClient duckClient;
	
	public DuckController(DuckClient duckClient) {
		this.duckClient = duckClient;
	}

    @GetMapping("/duck")
    public String getDuck(Model model) {

        DuckResponse duck = duckClient.getRandomDuck();

        model.addAttribute("duck", duck);

        return "duck";
    }
    
  }

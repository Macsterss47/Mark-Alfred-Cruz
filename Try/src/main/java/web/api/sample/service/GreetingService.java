package web.api.sample.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String paramAnswer(double d) {		
		return "The answer is  " + d;		
	}
}

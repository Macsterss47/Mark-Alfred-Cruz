package web.api.sample.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import web.api.sample.service.GreetingService;

@RestController
@RequestMapping("/api")

public class GreetingRest {

	
	//http://localhost:9090/api/param
	@Autowired
	GreetingService service;
	
	@Value("${custom.config.key}")
	float key;
	
	
	
	@GetMapping("/param")
	public String passingParam(@RequestParam int a, @RequestParam int b, @RequestParam int c,@RequestParam int e){
		return service.paramAnswer(( a + b + c + e)*key);
	
	}
	
}


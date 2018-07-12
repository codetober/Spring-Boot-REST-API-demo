package com.codetober.demoapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/dogs")
public class DogController {
	
	@RequestMapping( method=RequestMethod.GET, value="/tag/{tagNumber}")
	public Dog findDogByTagNumber(@PathVariable("tagNumber") int tagNumber) {
		// Check if tagNumber is even
		if(tagNumber % 2 == 0) {
			// Even
			return new Dog("Turbo", "Dingo", "Brown", tagNumber);
		} else {
			// Odd
			return new Dog("Carat", "Terrier Mix", "White", tagNumber);
		}
	}
}
package com.email.emai.writer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

//Set controller and api address for the class
//The annotation below can make a constructor that automatically
//injects the EmailGenerateService bean.
//Endpoints are /api/email/generate
@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@RestController
public class EmailGeneratorController {

	private final EmailGeneratorService emailGeneratorService;

	//ResponseEntity is a class and it fcan be the return type of the method.
//So here the method returns an object of type ResponseEntity that includes a String as the response body.
//@RequestBody annotation can convert JSON (FrontEnd message) into Java object
	@PostMapping("/generate")
	public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
		String response = emailGeneratorService.generateEmailReply(emailRequest);
		return ResponseEntity.ok(response);
	}
}

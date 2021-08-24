package com.gift.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gift.api.model.SecretQues;
import com.gift.api.service.SecretQuesService;

@RestController
@CrossOrigin(origins ="http://localhost:3000") 
public class SecretQuesController {
	@Autowired
	SecretQuesService secretquesservice;
	
	@PostMapping(path="/insertSecretQues",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SecretQues> insertSecretQues(@RequestBody SecretQues secretQues) {
		secretquesservice.storeSecretQues(secretQues);
	return new ResponseEntity<SecretQues>(secretQues,HttpStatus.OK);
	}

	@GetMapping(path="/getSecretQues",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SecretQues>> showSecretQues() {
		List<SecretQues> secretQues=secretquesservice.getSecretQues();
		return new ResponseEntity<List<SecretQues>>(secretQues,HttpStatus.OK);
	}
	
	@GetMapping(path="/getQuestionsByContact/{contact}",produces=MediaType.APPLICATION_JSON_VALUE)
	public SecretQues showByContact(@PathVariable String contact) {
		SecretQues secretQues=secretquesservice.getByContact(contact);
		return secretQues;
	}
	
	@GetMapping(path="/getQuestionsById/{userId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public SecretQues showByUserId(@PathVariable int userId) {
		SecretQues secretQues=secretquesservice.getByUserId(userId);
		return secretQues;
	}


}
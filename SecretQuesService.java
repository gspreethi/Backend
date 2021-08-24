package com.gift.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gift.api.doa.SecretQuesRepo;
import com.gift.api.model.SecretQues;
import com.gift.api.model.GiftUser;

@Service
public class SecretQuesService {

	@Autowired
	SecretQuesRepo secretQuesRepo;
	
	public SecretQues storeSecretQues(SecretQues secretQues) {
		secretQuesRepo.save(secretQues);
		return secretQues ;
	}
	
	public List<SecretQues> getSecretQues(){
		List<SecretQues> secretQues= secretQuesRepo.findAll();
		return secretQues;
	}
	
	public SecretQues getByContact(String contact)
	{
		SecretQues secretQues=secretQuesRepo.getByContact(contact);
		return secretQues;
		
	}

	public SecretQues getByUserId(int userId) {
		SecretQues secretQues=secretQuesRepo.findById(userId).orElse(new SecretQues());
		return secretQues;
		
		
	}

}
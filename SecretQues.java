package com.gift.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SecretQues {

	@Id
	private int userId;
	private String secretAns1;
	private String secretAns2;
	private String secretAns3;
	private String contact;

	public SecretQues() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getSecretAns1() {
		return secretAns1;
	}

	public void setSecretAns1(String secretAns1) {
		this.secretAns1 = secretAns1;
	}

	public String getSecretAns2() {
		return secretAns2;
	}

	public void setSecretAns2(String secretAns2) {
		this.secretAns2 = secretAns2;
	}

	public String getSecretAns3() {
		return secretAns3;
	}

	public void setSecretAns3(String secretAns3) {
		this.secretAns3 = secretAns3;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "SecretQues [userId=" + userId + ", secretAns1=" + secretAns1 + ", secretAns2=" + secretAns2
				+ ", secretAns3=" + secretAns3 + ", contact=" + contact + "]";
	}

	public SecretQues(int userId, String secretAns1, String secretAns2, String secretAns3, String contact) {
		super();
		this.userId = userId;
		this.secretAns1 = secretAns1;
		this.secretAns2 = secretAns2;
		this.secretAns3 = secretAns3;
		this.contact = contact;
	}

	
}
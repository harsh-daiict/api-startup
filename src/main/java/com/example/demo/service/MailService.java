package com.example.demo.service;

public interface MailService {

	public void sendSimpleMail(String[] recepients, String subject, String body);
	
	public void sendSimpleMail(String recepient, String subject, String body);
	
	public void sendSimpleMailWithAttachment(String[] recepients, String subject, String body, String pathToAttachment);
	
	public void sendSimpleMailWithAttachment(String recepient, String subject, String body, String pathToAttachment);
}

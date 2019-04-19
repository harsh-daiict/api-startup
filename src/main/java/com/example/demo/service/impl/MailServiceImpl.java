package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.example.demo.service.MailService;

@Component
public class MailServiceImpl implements MailService {

	@Autowired
	JavaMailSender mailSender;
	
	@Override
	public void sendSimpleMail(String[] recepients, String subject, String body) {
		
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(recepients);
		message.setSubject(subject);
		message.setText(body);
		mailSender.send(message);
		
	}
	
	@Override
	public void sendSimpleMail(String recepient, String subject, String body) {
		sendSimpleMail(new String[]{recepient}, subject, body);
	}
	
	@Override
	public void sendSimpleMailWithAttachment(String[] recepients, String subject, String body, String pathToAttachment) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void sendSimpleMailWithAttachment(String recepient, String subject, String body, String pathToAttachment) {
		sendSimpleMailWithAttachment(new String[]{recepient}, subject, body, pathToAttachment);
	}

}

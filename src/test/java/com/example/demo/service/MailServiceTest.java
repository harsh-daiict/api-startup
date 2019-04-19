package com.example.demo.service;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.example.demo.service.impl.MailServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class MailServiceTest {
	
	@Mock
	public JavaMailSender mailSender;
	
	@InjectMocks
	public MailServiceImpl mailService;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSendSinmpleMail() {
		mailService.sendSimpleMail("", "", "");
		doNothing().when(mailSender).send(any(SimpleMailMessage.class));
		verify(mailSender, times(1)).send(any(SimpleMailMessage.class));
	}
	
	@Test
	public void testSendSinmpleMailWithList() {
		mailService.sendSimpleMail(new String[]{}, "", "");
		doNothing().when(mailSender).send(any(SimpleMailMessage.class));
		verify(mailSender, times(1)).send(any(SimpleMailMessage.class));
	}
	

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class Emailsender {

	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(String toEmail,
						  String subject,
						  String body)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("muthuramlap2@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		
		mailSender.send(message);
		
		System.out.println("Success");
	}
}

package amdocs.com.test.svspring5tutorial.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import amdocs.com.test.svspring5tutorial.mail.MailSender;


@RestController
public class MailController {
	
	@Autowired
	private MailSender mailSender;
	
	@RequestMapping("/mail")
	public String mail() throws MessagingException{
		mailSender.send("svetlana_volkov@yahoo.com", "MailSubject", "MailBody");
		
		return "mail sent";
	}

}

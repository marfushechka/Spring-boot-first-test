package amdocs.com.test.svspring5tutorial.mail;

import javax.mail.MessagingException;

public interface MailSender {
	
	public void send(String to, String mailSubject, String mailBody) throws MessagingException;
}

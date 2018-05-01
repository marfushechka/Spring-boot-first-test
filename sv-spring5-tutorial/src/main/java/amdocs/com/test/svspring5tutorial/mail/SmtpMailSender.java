package amdocs.com.test.svspring5tutorial.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class SmtpMailSender implements MailSender {

	private static Log loger = LogFactory.getLog(MockMailSender.class);

	private JavaMailSender javaMailSender;
	
	public SmtpMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void send(String to, String mailSubject, String mailBody) throws MessagingException {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		
		helper.setSubject(mailSubject);
		helper.setText(mailBody);
		helper.setTo(to);
		
		javaMailSender.send(message);
		
		loger.info("Sending SMTP mail to: " + to);
		loger.info("Mail Subject: " + mailSubject);
		loger.info("MailBody: " + mailBody);
		
	}

}

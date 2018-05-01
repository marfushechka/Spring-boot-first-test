package amdocs.com.test.svspring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

public class MockMailSender implements MailSender {

	private static Log loger = LogFactory.getLog(MockMailSender.class);
	
	@Override
	public void send(String to, String mailSubject, String mailBody) {
		loger.info("Sending Dummy mail to: " + to);
		loger.info("Mail Subject: " + mailSubject);
		loger.info("MailBody: " + mailBody);
	}

}

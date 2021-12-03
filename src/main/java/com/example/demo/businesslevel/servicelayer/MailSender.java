package com.example.demo.businesslevel.servicelayer;

import org.springframework.scheduling.annotation.Async;

public interface MailSender {

	@Async
	void send(String mailTo, String subject, String message);

}

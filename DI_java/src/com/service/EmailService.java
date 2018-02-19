package com.service;

public class EmailService implements MessagingService {

	@Override
	public void sendMsg(String msg, String receiver) {
		System.out.println("EMAIL "+msg + " sent to "+receiver);
	}

}

package com.service;

public class SMSService implements MessagingService {
	@Override
	public void sendMsg(String msg, String receiver) {
		System.out.println("SMS " + msg + " sent to " + receiver);
	}
}

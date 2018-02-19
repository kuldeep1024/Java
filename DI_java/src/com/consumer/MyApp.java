package com.consumer;

import com.service.MessagingService;

public class MyApp {

	private MessagingService service;

	public MyApp() {

	}

	public MyApp(MessagingService service) {
		this.service = service;
	}

	public void processMessages(String msg, String rec) {
		service.sendMsg(msg, rec);
	}

}

package com.injector;

import com.consumer.MyApp;
import com.service.EmailService;

public class EmailInjector implements Injector {

	@Override
	public MyApp getConsumer() {
		return new MyApp(new EmailService());
	}

}

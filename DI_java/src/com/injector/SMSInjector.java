package com.injector;

import com.consumer.MyApp;
import com.service.SMSService;

public class SMSInjector implements Injector {

	@Override
	public MyApp getConsumer() {
		return new MyApp(new SMSService());
	}
}

package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCall {
	public ThreadCall() {
		System.out.println("creating service");
		ExecutorService service = Executors.newFixedThreadPool(10);

		List<MyCallable> futureList = new ArrayList<MyCallable>();
		for (int i = 0; i < 12; i++) {
			MyCallable myCallable = new MyCallable((long) i);
			futureList.add(myCallable);
		}
		System.out.println("Start");
		try {
			List<Future<Long>> futures = service.invokeAll(futureList);
			for (Future<Long> future : futures) {
				try {
					System.out.println("future.isDone = " + future.isDone());
					// System.out.println("future: call ="+future.get());
				} catch (Exception err1) {
					err1.printStackTrace();
				}
			}
		} catch (Exception err) {
			err.printStackTrace();
		}
		service.shutdown();
	}

	public static void main(String args[]) {
		ThreadCall demo = new ThreadCall();
	}

	class MyCallable implements Callable<Long> {
		Long id = 0L;

		public MyCallable(Long val) {
			this.id = val;
		}

		public Long call() {
			int a = 4, b = 0;
			System.out.println("a/b:" + (a / b));
			return id;
		}
	}
}
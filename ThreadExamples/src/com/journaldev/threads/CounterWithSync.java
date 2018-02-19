package com.journaldev.threads;

public class CounterWithSync {

	public static void main(String[] args) {

		Counter counter = new Counter();
		Thread threadA = new CounterThread(counter);
		Thread threadB = new CounterThread(counter);

		threadA.start();
		threadB.start();

		System.out.println(counter.count);
		
	}
}

class Counter {

	long count = 0;

	public synchronized void add(long value) {
		this.count += value;
	}
}

class CounterThread extends Thread {

	protected Counter counter = null;

	public CounterThread(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			counter.add(i);
		}
	}
}
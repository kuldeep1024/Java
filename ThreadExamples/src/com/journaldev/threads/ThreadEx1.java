package com.journaldev.threads;

public class ThreadEx1 {

	public static void main(String[] args) {

		for (int i = 200; i < 300; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

		Thread t1 = new Thread(new ThreadTh());
		t1.setName("t1");
		t1.start();

		Thread t2 = new Thread(new ThreadTh());
		t2.setName("t2");
		t2.start();

	}

}

class ThreadTh implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

class ThreadTh2 extends Thread {
	public void run() {
		for (int i = 100; i < 200; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
package com.journaldev.threads;

public class ThreadEx2 {

	public static void main(String[] args) {

		
		for (int i = 0; i < 200; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
		Thread t= new Thread(new ThreadTh5());
		t.start();
		

	}

}

class ThreadTh5 implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

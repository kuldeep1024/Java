package com.multithreading;

public class ThreadRunnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadAA());
		t1.start();
		Thread t2 = new Thread(new ThreadAA());
		t2.start();
	}

}

class ThreadAA implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
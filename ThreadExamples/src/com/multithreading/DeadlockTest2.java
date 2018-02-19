package com.multithreading;

public class DeadlockTest2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Thread77());
		t1.start();
		//t1.join();
		new Thread(new Thread88()).start();
	}

}

class Thread77 implements Runnable {

	@Override
	public void run() {
		synchronized (String.class) {
			System.out.println("Thread 1: locked resource 1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (Integer.class) {
				System.out.println("Thread 1: locked resource 2");
			}
		}
	}
}

class Thread88 implements Runnable {

	@Override
	public void run() {
		synchronized (Integer.class) {
			System.out.println("Thread 2: locked resource 1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (String.class) {
				System.out.println("Thread 2: locked resource 2");
			}
		}
	}
}
package com.thread;

public class ThreadRunn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t = new T();
		Thread th = new Thread(t);
		th.start();
	}

}
class T implements Runnable {
	public void run() {
		System.out.println(1/0);
	}
}
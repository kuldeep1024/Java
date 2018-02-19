package com.journaldev.threads;

public class TreadSleep {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start)); 
	}

}

package com.multithreading;

public class ThreadExtends {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadA t1= new ThreadA();
		ThreadA t2= new ThreadA();
		ThreadA t3= new ThreadA();
		ThreadA t4= new ThreadA();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t4.setName("D");
		
		t1.start();t1.join();
		t2.start();t2.join();
		t3.start();
		t4.start();
		t1.test();//t2.test();t3.test();t4.test();
	}

}
class ThreadA extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println("Thread " +currentThread().getName()+" : "+i);
		}
	}
	
	void test(){
		for(int i=10;i<20;i++){
			try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			System.out.println(currentThread().getName()+", method test : "+i);
		}
	}
}
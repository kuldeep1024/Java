package com.synch;

/**
 * Java class to demonstrate use of synchronization method and block in Java
 */
public class SycnronizationExample {
	public synchronized void lockedByThis() {// blocks "this" from here....
		System.out.println(" This synchronized method is locked by current instance of object i.e. this");
	}// to here

	public static synchronized void lockedByClassLock() {// blocks "this" from here....
		System.out.println("This static synchronized method is locked by class level lock of this class i.e. SychronizationExample.class");
	}// to here

	public void lockedBySynchronizedBlock() {
		System.out.println("This line is executed without locking");
		Object locker = String.class; // class level lock of String class
		synchronized (locker) {// blocks "this" from here....
			System.out.println("synchronized block, locked by lock represented using locker variable");
		} // to here
	}
}
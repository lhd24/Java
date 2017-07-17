package com.lhd.thread;

public class ThreadTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.start();
		
		Dog dog = new Dog();
		Thread t = new Thread(dog);
		t.start();
	}

}

class Cat extends Thread {
	
	@Override
	public void run() {
		int count=0;
		while(true)
		{
			count ++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Cat:" +count);
			if (count >= 10) {
				break;
			}
		}
	}
}

class Dog implements Runnable {
	
	@Override
	public void run() {
		int count=0;
		while(true)
		{
			count ++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Dog" + count);
			if (count >= 10) {
				break;
			}
		}
	}
}

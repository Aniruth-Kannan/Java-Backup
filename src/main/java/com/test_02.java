package com;

public class test_02 implements Runnable{
	private int x;
	private int y;
	public static void main (String args[]){
		test_02 test = new test_02();
		(new Thread(test)).start();
		(new Thread(test)).start();
	}

	public synchronized void run() {
		for(;;) {
			x++;
			y++;
			System.out.println("x: " + x + " y: " + y );
		}
		
	}

}

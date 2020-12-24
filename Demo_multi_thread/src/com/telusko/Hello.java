package com.telusko;

public class Hello extends Thread

{
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.print("Hello !! ");
			try {
				Thread.sleep(1000);
						
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

}

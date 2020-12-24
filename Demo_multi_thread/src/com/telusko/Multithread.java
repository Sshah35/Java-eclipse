package com.telusko;

/**
 * @author LIONS
 *
 */
public class Multithread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	Hi h = 	new Hi (); 
	
	Hello he = new Hello(); 
	
	try {
		Thread.sleep(10);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	h.start();
	
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	he.start();
	
	
	try {
		Thread.sleep(1000);
		
		System.out.println("Hello World from Main");
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
	
	}

}


//h.show();       // start will call the run internally so we dont need the show method
//he.show();


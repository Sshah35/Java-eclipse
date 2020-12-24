package com.telusko;

// Tways to use the Thread thais  the Thread Class or Interface 

public class Runnable_interface {

	public static void main(String[] args) throws Exception {
		

			
		Thread t1 = new Thread (() ->{     	
			for (int i = 1; i <= 5; i++){
				System.out.println("Hope");
				try {Thread.sleep(1000);} catch(Exception e ) {}	
			}
		}); 

		Thread t2 = new Thread ( () -> {		
			for (int i = 1; i <= 5; i++){
				System.out.println("All is Well");
				try {Thread.sleep(1000);} catch(Exception e ) {} }
		}) ;
		
		
		// set name  to change the name of the thread and it will help to identify the thread
		// you can also use the name after the commas. 
		t1.setName("\t\tHope Thread\n");
		
		t2.setName("\t\tWell Thread\n");
		
		// can set the prority also you cold name the priority 	
		t1.setPriority(1);
		t2.setPriority(10);
		
		// get the name of the thread
		System.out.println(t1.getName());
		
		System.out.println("By default it is created with the Thread zero");
		
		
		
		//gets the name of the thread
		System.out.println(t2.getName());

		
		t1.start();
		Thread.sleep(10);
		t2.start();	
		
		// use the method join to wait till the all job is done 
		t1.join(); 
		t2.join();
		
		// here the isAlive will check to see if it is alive
		System.out.println("\t\t\nFinished execution not Alive T1 =  False");
		System.out.println(t1.isAlive());
		
		System.out.println("\t\t\nFinished execution not Alive T2 = False");
		System.out.println(t2.isAlive());
		
		System.out.println(" \t\tNothing Else Take Care Bye !!!\n\n");
		
		
	}
}


// Since it is the interface you could not instanstiate ;






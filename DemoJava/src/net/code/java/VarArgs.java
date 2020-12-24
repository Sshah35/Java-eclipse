/**
 * 
 */
package net.code.java;

/**
 * @author LIONS
 *
 */
public class VarArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// you can also use the main method with the ... ags instead of the the string [] 
		// you could also alter the static and public
		Display obj = new Display(); 
		obj.show(5,6,7,6,7,7,8);

	}

}

// This is a class with Display 

class Display {
//	
//	  public void show(int a )
//	  { 
//		  System.out.println(a);
//	  
//	  } 
//	  public void show(int a , int b , int c ) 
//	  { System.out.println(a);
//	    System.out.println(b); 
//	    System.out.println(a);
//	   
//	  }
	  
	  
	  //  use Variable arguments  will take undefined values passed by the User. 
	  // If you have two method that has overloaded one with three argument then it will use that
	  public void show(int ... a  ) 
	  { 
//	    System.out.println(a);
//	    System.out.println(b); 
//	    System.out.println(a);
		   for (int i : a ) 
		   {
			   System.out.print(i + " ");
		   }   
	   
	  }

	 
}






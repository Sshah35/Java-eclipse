/**
 * 
 */
package net.code.java;

/**
 * @author LIONS
 *
 */
public class SwappNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
	
		int a = 5 ; 
		int b = 4; 
		
//     int temp ;      // not an efficient way to swapp the number 
//     temp = a ; 
//	   a=b;
//	   b=temp ;

//		a=a+b;  // 9 
//		b=a-b;  //5 
//		a=a-b;  //4     swapp the number reduce the number of bytes
		
		// U could user the XoR
//		a = a^b ; // 101 XoR 100 001
//		b = a^b;//001 XoR 100 101
//		a=a^b; // 001 XoR 101 100

		b = b+a-(a=b);  // this is the easiest way to swapp the number. 
		
		System.out.println("a : " + a );; 
		System.out.println("b : "+ b);
		
		

	}

}

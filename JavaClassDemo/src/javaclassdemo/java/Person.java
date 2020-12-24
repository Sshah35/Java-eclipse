/**
 * 
 */
package javaclassdemo.java;

/**
 * @author LIONS
 *
 */
public class Person extends Employee  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee() ;
		Employee e2 = new Employee();
		e1.setFirstname("samir");
		e1.setLastname("shah");
		e1.setId(123);
		
		e2.setFirstname("sara");
		e2.setLastname("patel");
		e2.setId(324);
		
		System.out.println(e1);
		System.out.println(e2);
		
	}


}

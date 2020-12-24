/**
 * 
 */
package javaclassdemo.java;

/**
 * @author LIONS
 *
 */
public class Employee {

	private int id ;
	private String firstname ; 
	private String lastname;
	/**
	 * @return the id
	 */
	
	public Employee() {

	}
	/**
	 * @param id the id to set
	 */

	/**
	 * @param id
	 * @param firstname
	 * @param lastname
	 */
	public Employee(int id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	
	
}

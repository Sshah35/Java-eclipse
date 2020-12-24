/**
 * 
 */
package net.code.java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author LIONS
 *
 */
public class Filewrite {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("demo.txt");
		
		try (DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF("Demo Content this is the out put This is updated ");
		}
		
		FileInputStream fis = new FileInputStream("demo.txt");
		try (DataInputStream dis = new DataInputStream(fis)) {
			String str = dis.readUTF() ; 
			System.out.println(str);
		}
		
		
	}

}

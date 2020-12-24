
public class Arraysapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 7;
		int[] values  = new int [3] ;
		values[0]= 2 ;
		values[1]= 4 ;
		values[2]= 6;
		
		System.out.println(values[0]);
		System.out.println(values[1]);	
		System.out.println(values[2]);
		
		System.out.println(" Values using the for Loop:");
		
		for(int i =0 ;i<values.length;i++) {
			
			System.out.println(values[i]);
			
		}
		
		int[] num = {10,20,30,40};
		for (int i = 0; i < num.length; i++) {
			
			System.out.println("\n"+ "Values of index at :"+i +"\tIS :"+ num[i]);
		}
		
		String[] words = {"Apple", "Bannana" , "Pear", "Kiwi"};
		
		for (int i = 0; i < words.length; i++) {
			
			System.out.println("\n"+ "Values of index at :"+i +"\tIS :"+ words[i]);
		}
		
		String[] veg = new String [3];
		
		veg[0]= "carrots"; 
		veg[1]= " Tomatoes";
		veg[2]= " Cabbage";
		
		for (String v : veg) {
			System.out.println(v);
		}

			
		
	}

}

package programs;

public class stringLength {
	
	public static void main(String[] args) {
		
		String str = "Good Morning"; 
		
		int count =0;
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			
			count++;
		}
		
		System.out.println(count);
	}

}

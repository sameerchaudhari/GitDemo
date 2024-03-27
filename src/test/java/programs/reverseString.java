package programs;

public class reverseString {
	
	public static void main(String[] args) {
		
		
		String str ="hello";
		
		String rev ="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev =rev+str.charAt(i);
		}
		System.out.println(rev);
		
		//alternate way
		
		StringBuilder sb = new StringBuilder(str).reverse();
		
		System.out.println(sb.toString());
		
		//alternate way
		
		StringBuffer sb1 = new StringBuffer(str).reverse();
		System.out.println(sb1.toString());
	}
	

	


}

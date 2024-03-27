package programs;

public class whiteSpacesAndSpecialCharacters {
	
	public static void main(String[] args) {
		
		String str = "   Hello   World  "; 
		
		str =str.trim();
		
		str =str.replaceAll("\\s+", "");
		
		System.out.println(str);
		
		System.out.println("==================================");
		
		String str1 = "Hello!@#$&*+World{}!";
		
		str1= str1.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println(str1);
	}
	
	

}

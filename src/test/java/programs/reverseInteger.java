package programs;

public class reverseInteger {
	
	public static void main(String[] args) {
		
		int num = 12345;
		
		int rev =0;
		
		while(num!=0) {
		
			rev =rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		//Alternate way
		//convert int to string 
		
//		String numStr = String.valueOf(num);
//		
//		//use stringbuilder to reverse the string 
//		
//		StringBuilder sb = new StringBuilder(numStr).reverse();
//		
//		//convert string back to integer 
//		
//		int reversedNum = Integer.parseInt(sb.toString());
//		
//		System.out.println(reversedNum);
	
}

}

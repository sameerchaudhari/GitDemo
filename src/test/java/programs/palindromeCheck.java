package programs;

public class palindromeCheck {
	
	public static void main(String[] args) {
		
		String str = "madam";
		
		boolean isPalindrome = checkPalindrome(str);
		
		if(isPalindrome)
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

	private static boolean checkPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str).reverse();
		
		return str.equals(sb.toString());
	}

}

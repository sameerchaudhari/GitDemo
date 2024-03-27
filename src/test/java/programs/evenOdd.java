package programs;

public class evenOdd {
	
	public static void main(String[] args) {
		
		for(int i=0 ;i<=100;i++) {
			if(isEven(i))
			{
				System.out.println(i + "");
			}
		}
		
		for(int j=0;j<=100;j++) {
			if(!isEven(j))
			{
				System.out.println(j + "");
			}
		}
	}

	private static boolean isEven(int i) {
		
		return i%2==0;
	}

}

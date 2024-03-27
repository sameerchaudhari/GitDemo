package programs;

public class largestNumberInArray {
	
	public static void main(String[] args) {
		
		int[] array = {3,5,9,2,4};
		
		//assume that first element is the largest number 
		
		int largest = array[0];
		
		for(int i=1; i<array.length;i++)
		{
			if(array[i]>largest) 
			{
				largest = array[i];
			}
		}
		System.out.println("largest number is:" + largest);
	}

}

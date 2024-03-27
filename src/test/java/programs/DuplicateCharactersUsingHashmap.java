package programs;

import java.util.HashMap;

public class DuplicateCharactersUsingHashmap {
	
	public static void main(String[] args) {
		
		String str = "aabbcccdd";
		
		char[] ch =str.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(char c :ch) 
		{
			
			if(map.containsKey(c)) 
			{
				
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		//print duplicate characters 
		
		for(HashMap.Entry<Character,Integer> entry: map.entrySet())
		{
			if(entry.getValue()>1) 
			{
				System.out.println(entry.getKey()+ "" + entry.getValue());
			}
		}
	}

}

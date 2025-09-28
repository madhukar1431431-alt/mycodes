	package MadhuTestJava;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Findduplicatecharinstring {

	public static void main(String[] args) {
		
		String A="MadhukarGavvalaM";
		char c[]=A.toCharArray();
		
		HashMap<Character,Integer>map=new HashMap<>();
		
		for(char ch:c)
		{
			
			{
				map.put(ch, map.getOrDefault(ch, 0)+1);//adding char and number to hshmap
			}
		}
		for(char e:map.keySet())//key set will have all values of char
		{
			if(map.get(e)>1)//get will give count
			{
				System.out.print(e+" ");
			}
		}
		
		

	}

}

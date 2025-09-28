package MadhuTestJava;

import java.util.LinkedHashMap;

public class occerencewithletter {

	public static void main(String[] args) {
		String s="Madhukar Gavvala";
		freq(s);
		
		
	}
	public static void freq(String s)
	{
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		for(char c:s.toCharArray())
		{
			if(c!=' ')
			{
				map.put(c, map.getOrDefault(c, 0)+1);
				System.out.print(c+""+map.get(c));
				//map.remove(c);
				
				
			}
			else
			{
				System.out.print(" ");
			}
		}
		
		
		
		
	}

}

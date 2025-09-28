package MadhuTestJava;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class countingthedegitsinnumber {

	public static void main(String[] args) {
		String s="9959643296";
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		for(char c:s.toCharArray())
		{
			map.put(c,map.getOrDefault(c, 0)+1);
			
		}
		System.out.println(map);




	}
	

}

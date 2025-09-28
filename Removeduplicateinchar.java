package MadhuTestJava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Removeduplicateinchar {

	public static void main(String[] args) {
		
		String s="Madhukar Gavvala";
		
		LinkedHashSet<Character>list=new LinkedHashSet<>();
		StringBuilder sb= new StringBuilder();
		for(char c:s.toCharArray())
		{
			if(list.add(c))
				sb.append(c);//add ing only unique in string builder
			}
			
			
			
		
		
        System.out.println(sb);
	}

}

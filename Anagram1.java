package MadhuTestJava;

import java.util.Arrays;
import java.util.stream.Stream;

public class Anagram1 {

	public static void main(String[] args) {
		
		String s="Madhukar";
		String s1="kdhumaar1";
		
		String s2=sort(s);
		String s3=sort(s1);
		
		if(s2.equals(s3))
		{
			System.out.println("ANAGram");
			
		}
		else
		{
			System.out.println("NOt an ANAGram");
		}

	}
	public static String sort(String anagram)
	{
		char c[]=anagram.toLowerCase().toCharArray();
		Arrays.sort(c);
		return String.valueOf(c);
		
	}

}

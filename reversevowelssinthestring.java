package MadhuTestJava;

import java.util.ArrayList;
import java.util.List;

public class reversevowelssinthestring {

	public static void main(String[] args) {
		String a="Madhu";
		char c[]=a.toCharArray();
		String Vowels="AEIOUaeiou";
		List<Character>list=new ArrayList<>();
		
		for(char ch:c)
		{
			if(Vowels.indexOf(ch)!=-1)
			{
				list.add(ch);
				//System.out.println(list);
			}
		}
		int n=list.size()-1;
		for(int i=0;i<a.length();i++)
		{
			if(Vowels.indexOf(c[i])!=-1)
			{
				c[i]=list.get(n--);
			}
		}
		 System.out.println("Original: " + a);
	       System.out.println("After Reversing Vowels: " + new String(c));
	
		
		
		

	}

}

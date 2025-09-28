package MadhuTestJava;

import java.util.ArrayList;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		String a="Madhu";
		String b="gavvala";
		
		StringBuilder sb=new StringBuilder(a.length()+b.length());
		
		int n1=a.length();int n2=b.length();
		int n=Math.max(n1, n2);
		for(int i=0;i<n;i++)
		{
			if(i<n1)
			{
				sb.append(a.charAt(i));
			}
			if(i<n2)
			{
				sb.append(b.charAt(i));
			}
		}
		
		System.out.println(sb);
		
		
		
	
	
		

	}

}

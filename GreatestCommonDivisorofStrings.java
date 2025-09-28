/*Greatest Common Divisor of Strings
Easy
Topics
premium lock icon
Companies
Hint
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.*/

package MadhuTestJava;

public class GreatestCommonDivisorofStrings {

	public static void main(String[] args) {
		String a="ABCDABCD";
		String b="ABCD";
		int a1=a.length();
		int b1=b.length();
		int count=0;
		int n=Math.min(a1, b1);
		for(int i=0;i<n;i++)
		{
			if(a.charAt(i)==b.charAt(i))
			{
				count++;
			}
		
		}
		if(count==b1)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println("_");
		}
		

	}

}

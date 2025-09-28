package MadhuTestJava;

public class reverseofastring {

	public static void main(String[] args) {
		
		String s="Madhukar";
//		String s1="";
//		int n=s.length();
//		char c;
//		for(int i=0;i<n;i++)
//		{
//			 c=s.charAt(i);
//			s1=c+s1;
//		}
//		System.out.println(s1);
//	}
StringBuilder s1=new StringBuilder();
s1.append(s);
s1.reverse();
System.out.println(s1);


}
}

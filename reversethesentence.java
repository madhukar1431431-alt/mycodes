package MadhuTestJava;

public class reversethesentence {

	public static void main(String[] args) {
		String s="My name is Madhukar";
		String [] s1=s.split(" ");
		
		for(int i=0;i<=s1.length-1;i++)
		{
			String rever=rev(s1[i]);
			
			System.out.print(rever+" ");
			
		}
			

	}
	public static String rev(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
	

}

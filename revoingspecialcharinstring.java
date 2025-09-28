package MadhuTestJava;

public class revoingspecialcharinstring {

	public static void main(String[] args) {
		
		String s="MAdhukar1a23Havvala";
		
		String res=s.replaceAll("[^A-za-z]", "");
	
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//		
//			if(c>='A' && c<='Z'|| c>='a'&&c<='z')
//			{
//				res+=c;
//			}
//		}
		System.out.println(res);
			
			
			

	}

}

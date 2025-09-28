package MadhuTestJava;

public class Removingspecialusingstringbuilder {

	public static void main(String[] args) {
		String s="M12#434ewdslkhwlhliugcuasiugzi";
		//String s1=s.replaceAll("[^A-Za-z1-9]", "");
//		StringBuilder name=new StringBuilder();
//		;
//		for(int i=0;i<s.length();i++)
//			
//		{ char ch=s.charAt(i);
//			if(Character.isLetter(ch))
//			{
//				name.append(ch);
//			}
//		}
//		
//		
//System.out.println(name);
//	}

	String s1=s.replaceAll("[^A-Za-z0-9]", "");
	System.out.println(s1);
}
}









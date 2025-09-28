package MadhuTestJava;

public class Stringhasalluniquechar {

	public static void main(String[] args) {
		String s="Madhua";
		int count=0;
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 char c=s.charAt(i);
			 for(int j=i+1;j<s.length();j++)
			 {
				 char d=s.charAt(j);
				 if(c==d)
				 {
					 count++;
					 System.out.println(d);
					 
				 }
			 }
		 }
		 if(count==0)
		 System.out.println("Having unique");
		 else
		 {
			 System.out.println("Not an unique"); 
		 }

	}

}

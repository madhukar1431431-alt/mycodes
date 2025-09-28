package MadhuTestJava;

public class reverseofstringwithoutchaningspecialcar {

	public static void main(String[] args) {
		String str="Ma&d,h!u";
		char c[]=str.toCharArray();
		for(int i=0, j = c.length-1;i<j;)
		{
			if(!Character.isLetter(c[i]))
			{
				i++;
				
			}
			else if(!Character.isLetter(c[j]))
			{
				j--;
			}
			else
			{
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				i++;
				j--;
			}
			
		}
		System.out.println(c);
		

	}


}

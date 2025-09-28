package MadhuTestJava;

public class countvowelsandconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madhu";
		String vowels="AEIOUaeiou";
		int vowe=0;
		int con=0;
		for (Character c:s.toCharArray())
		{
			if(vowels.indexOf(c)!=-1)
			{
				vowe++;
				
				
			}
			else
			{
				con++;
			}
			
		}
		System.out.println(vowe+" "+con);

	}

}

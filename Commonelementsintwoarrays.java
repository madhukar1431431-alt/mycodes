package MadhuTestJava;

public class Commonelementsintwoarrays {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,7};
		int b[]= {5,6,7,8,9};
		
		for(int i=0;i<=a.length-1;i++)
		{
			int c=a[i];
			for(int j=0;j<=b.length-1;j++)
			{
				if(c==b[j]) {
					System.out.println(b[j]);
				}
				
			}
			
		}

	}

}

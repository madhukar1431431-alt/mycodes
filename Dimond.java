package MadhuTestJava;

public class Dimond {

	public static void main(String[] args) {
	int n=6;
	for(int i=1;i<=n;i++)
	{
		for(int j=n-i;j>0;j--)
		{
			System.out.print(" ");
		}	
		for(int j=1;j<=(2*i-1);j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = n-1; i >0 ; i--) {
        // Print leading spaces
        for (int j = i; j <n ; j++) {
            System.out.print(" ");
        }
        // Print stars
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("*");
        }
        System.out.println();
		
	}
	
	
	
	}
}
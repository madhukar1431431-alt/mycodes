package MadhuTestJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Missingnumberinarray {

	public static void main(String[] args) {
		int a[]= {10,9,7,6,5,3,2,1};
		Arrays.sort(a);
		
		
		
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]!=i+1)
			{
			System.out.println("missing number is:"+""+(i+1));
			break;
			}
		}

	}

}

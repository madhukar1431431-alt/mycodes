package MadhuTestJava;

import java.util.Arrays;

public class minandmaxinarray {

	public static void main(String[] args) 
	{
	
	int a[]= {10,10,2,3,3,4,5,6,7,8,9,1,0};
	int n=a.length;
//	int min =a[0];
//	int max=a[0];
//	
//	
//	for(int i=1;i<=a.length-1;i++)	
//		
//	{
//		if(a[i]<=min)
//		{
//			min=a[i];
//		}
//		if(a[i]>=max)
//		{
//			max=a[i];
//		}
//}
//	System.out.println(min);
//	System.out.println(max);
	
	Arrays.sort(a);
	int min=a[0];
	int max=a[n-1];
	System.out.println(min+" "+max);
	
}
}


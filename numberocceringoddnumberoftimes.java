package MadhuTestJava;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class numberocceringoddnumberoftimes {

	public static void main(String[] args) {
		int a[]= {9,9,9,4,3,1,2,2,3,1,1};
		
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
		for(int i:a)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
			
			
		}
		for(int i:map.keySet())
		{
			if(map.get(i)%2!=0)
			{
				System.out.println(i+" ");
			}
		}

	}
}


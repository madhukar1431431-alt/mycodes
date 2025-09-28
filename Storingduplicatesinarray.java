package MadhuTestJava;

import java.util.Collections;
import java.util.HashSet;

public class Storingduplicatesinarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,2,3,4,1};
		HashSet <Integer>set=new HashSet<>();
		HashSet <Integer>Dub=new HashSet<>();
		for(int n:a)
		{
			if(!(set.add(n)))
				
			{
				Dub.add(n);
			}				
			
		}
			
		System.out.println(Dub);
	}

}

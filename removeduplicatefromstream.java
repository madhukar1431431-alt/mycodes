package MadhuTestJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicatefromstream {

	public static void main(String[] args) {
		int a[]= {3,2,1,5,6,78,87,1,2,3};
	List<Integer>l=Arrays.stream(a).boxed()//convert int[] to integer
			.distinct().collect(Collectors.toList());
	System.out.println(l);
		
		
		
	
		
		

	}

}

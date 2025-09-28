	package MadhuTestJava;
	
	import java.util.Arrays;
	import java.util.LinkedHashMap;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Set;
	import java.util.stream.Stream;
	
	public class removeduplicatesinarray {
	
		public static void main(String[] args) {
			
			int a[]= {1,1,2,3,4,5,6,7,2,6};
			remove(a);
		}
		
		public static void remove(int a[])
		{
			LinkedHashSet<Integer>s=new LinkedHashSet<Integer>();
			for(int i=0;i<=a.length-1;i++)
			{
				s.add(a[i]);
				
			}
			System.out.println(s);
			
			
			
		}
	}

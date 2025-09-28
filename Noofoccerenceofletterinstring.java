package MadhuTestJava;

import java.util.HashMap;

public class Noofoccerenceofletterinstring {

	public static void main(String[] args) {
		String s = "Madhukar Gavvala".replaceAll(" ", "").toLowerCase(); // Remove spaces & convert to lowercase
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
        	
        	hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }



        System.out.println(hashMap); // Print the character frequencies
    }
}


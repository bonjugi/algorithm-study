package dev.bonjugi.algorithmstudy.recursion;

public class Recursion {

	static void recursionPrint(String input){

		// base case
		if (input.length() <= 0) {
		} else {
			System.out.println(input);
			recursionPrint(input.substring(1));
		}

	}



}

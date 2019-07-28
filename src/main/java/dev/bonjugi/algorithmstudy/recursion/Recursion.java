package dev.bonjugi.algorithmstudy.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Recursion {


	static void recursionPrint(String input){

		// base case
		if (input.length() <= 0) {
		} else {
			log.debug(input);

			recursionPrint(input.substring(1));
		}

	}



}

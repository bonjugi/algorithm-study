package dev.bonjugi.algorithmstudy.street11test;

import org.junit.Test;

public class Test1 {


	@Test
	public void test(){

		int solution = solution(6);
		System.out.println(solution);
	}

	private int solution(int N){

		return getInt(N);
	}

	private int getInt(int n){

	    if(n==17){
	        return 5;
	    }

		if (n < 1) {
			return 0;
		}
		return n+getInt(n-1);

	}

}

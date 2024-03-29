package dev.bonjugi.algorithmstudy.codility;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;


public class BinaryGapTest {

	@Test
	public void test(){

		int solution = solution(561892);
		System.out.println(solution);
	}

	public int solution(int N){

		BinaryGap binaryGap = new BinaryGap(N);
		return 	binaryGap.maxGap();
	}

	private class BinaryGap {
		private Set<Integer> sets;

		public BinaryGap(int N) {
			String bin = toBinary(N);
			binarySets(bin);
		}

		private void binarySets(String string){

			sets = new LinkedHashSet<>();

			String[] split = string.split("");
			for (int i = 0; i < split.length; i++) {
				if (split[i].equals("1")) {
					sets.add(i);
				}
			}
		}

		public String toBinary(int decimal){

			if (decimal < 2) {
				return ""+decimal;
			}

			int cut = decimal / 2;
			int rest = decimal % 2;

			return toBinary(cut)+rest;
		}


		private int maxGap() {

			if (sets.size() < 2)
				return 0;


			int maxGap = 0;
			int before = 0;
			int after = 0;

			for (Integer current : sets) {
				before = after;
				after = current;
				int gap = after - before;

				if (gap > maxGap)
					maxGap = gap;

			}

			return maxGap-1;
		}

	}
}
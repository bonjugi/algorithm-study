package dev.bonjugi.algorithmstudy.sort;

import java.util.List;

public class SelectionSort implements MySort {


	List<Integer> input;
	int finishIndex = 0;

	SelectionSort(List<Integer> input) {
		this.input = input;
	}


	@Override
	public List<Integer> reverse() {

		while (finishIndex != input.size() - 1)
			moveFirstMaxValue();


		return input;
	}

	int getMaxValue() {

		int max = 0;

		for (int i=finishIndex; i<input.size(); i++) {
			int val = input.get(i);
			if (max < val) {
				max = val;
			}

		}

		return max;
	}

	void moveFirstMaxValue() {

		Integer maxValue = getMaxValue();

		input.remove(maxValue);
		input.add(finishIndex, maxValue);
		finishIndex++;
	}
}

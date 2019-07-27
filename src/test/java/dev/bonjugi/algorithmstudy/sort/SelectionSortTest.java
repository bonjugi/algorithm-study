package dev.bonjugi.algorithmstudy.sort;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {

	@Test
	public void input1() {

		// given
		MySort sort = new SelectionSort(Lists.newArrayList(5,2,4,6,1,3));

		// when
		List<Integer> output = sort.reverse();

		// then
		assertThat(output).isEqualTo(Lists.newArrayList(6,5,4,3,2,1));



		// given
		MySort sort2 = new SelectionSort(Lists.newArrayList(5,2,4,6,3,7));

		// when
		List<Integer> output2 = sort2.reverse();

		// then
		assertThat(output2).isEqualTo(Lists.newArrayList(7,6,5,4,3,2));


	}


	@Test
	public void findMax(){
		SelectionSort sort = new SelectionSort(Lists.newArrayList(5,2,4,6,3));
		assertThat(sort.getMaxValue()).isEqualTo(6);

		SelectionSort sort2 = new SelectionSort(Lists.newArrayList(5));
		assertThat(sort2.getMaxValue()).isEqualTo(5);
	}


	@Test
	public void moveFirstMaxValue(){

		// given
		SelectionSort sort = new SelectionSort(Lists.newArrayList(5,2,4,6,3,7));

		// when
		sort.moveFirstMaxValue();

		// then
		assertThat(sort.input).isEqualTo(Lists.newArrayList(7,5,2,4,6,3));



		// given
		SelectionSort sort2 = new SelectionSort(Lists.newArrayList(5,2,4,9,3,7));

		// when
		sort2.moveFirstMaxValue();

		// then
		assertThat(sort2.input).isEqualTo(Lists.newArrayList(9,5,2,4,3,7));

	}





}
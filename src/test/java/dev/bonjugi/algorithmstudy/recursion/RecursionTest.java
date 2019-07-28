package dev.bonjugi.algorithmstudy.recursion;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursionTest {

	@Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


	@Test
	public void length(){

		// given
		Recursion.recursionPrint("asdfg");

		// when
		List<String> split = getLogs();

		// then
		assertThat(split.size()).isEqualTo(5);
		assertThat(split.get(0)).isEqualTo("asdfg");
		assertThat(split.get(1)).isEqualTo("sdfg");
		assertThat(split.get(2)).isEqualTo("dfg");
		assertThat(split.get(3)).isEqualTo("fg");
		assertThat(split.get(4)).isEqualTo("g");
	}

	private List<String> getLogs() {
		return Arrays.asList(systemOutRule.getLog().split("\\n"));
	}

}